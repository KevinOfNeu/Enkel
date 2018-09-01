package com.bendcap.enkel.compiler.domain.scope;

import com.bendcap.enkel.compiler.domain.MetaData;
import com.bendcap.enkel.compiler.domain.node.expression.Argument;
import com.bendcap.enkel.compiler.domain.type.BultInType;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.exception.FieldNotFoundException;
import com.bendcap.enkel.compiler.exception.LocalVariableNotFoundException;
import com.bendcap.enkel.compiler.exception.MethodSignatureNotFoundException;
import com.bendcap.enkel.compiler.exception.MethodWithNameAlreadyDefinedException;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.map.LinkedMap;

import java.util.*;

import static java.util.stream.Collectors.toList;


/**
 * Created by KevinOfNeu on 2018/8/22  09:37.
 */
public class Scope {
    private final List<FunctionSignature> functionSignatures;
    private final MetaData metaData;
    private final LinkedMap<String,LocalVariable> localVariables;
    private final Map<String,Field> fields;

    public Scope(MetaData metaData) {
        this.metaData = metaData;
        functionSignatures = new ArrayList<>();
        localVariables = new LinkedMap<>();
        fields =  new LinkedMap<>();
    }

    public Scope(Scope scope) {
        metaData = scope.metaData;
        functionSignatures = Lists.newArrayList(scope.functionSignatures);
        fields = new LinkedMap<>(scope.fields);
        localVariables = new LinkedMap<>(scope.localVariables);
    }

    public void addSignature(FunctionSignature signature) {
        if(isParameterLessSignatureExists(signature.getName())) {
            throw new MethodWithNameAlreadyDefinedException(signature);
        }
        functionSignatures.add(signature);
    }

    public boolean isParameterLessSignatureExists(String identifier) {
        return isSignatureExists(identifier,Collections.emptyList());
    }

    public boolean isSignatureExists(String identifier, List<Argument> arguments) {
        if(identifier.equals("super")) return true;
        return functionSignatures.stream()
                .anyMatch(signature -> signature.matches(identifier,arguments));
    }

    public FunctionSignature getMethodCallSignatureWithoutParameters(String identifier) {
        return getMethodCallSignature(identifier, Collections.<Argument>emptyList());
    }

    public FunctionSignature getConstructorCallSignature(String className,List<Argument> arguments) {
        boolean isDifferentThanCurrentClass = !className.equals(getClassName());
        if(isDifferentThanCurrentClass) {
            List<Type> argumentsTypes = arguments.stream().map(Argument::getType).collect(toList());
            return new ClassPathScope().getConstructorSignature(className, argumentsTypes)
                    .orElseThrow(() -> new MethodSignatureNotFoundException(this,className,arguments));
        }
        return getConstructorCallSignatureForCurrentClass(arguments);
    }
    private FunctionSignature getConstructorCallSignatureForCurrentClass(List<Argument> arguments) {
        return getMethodCallSignature(Optional.empty(), getClassName(), arguments);
    }
    public FunctionSignature getMethodCallSignature(Optional<Type> owner,String methodName,List<Argument> arguments) {
        boolean isDifferentThanCurrentClass = owner.isPresent() && !owner.get().equals(getClassType());
        if(isDifferentThanCurrentClass) {
            List<Type> argumentsTypes = arguments.stream().map(Argument::getType).collect(toList());
            return new ClassPathScope().getMethodSignature(owner.get(), methodName, argumentsTypes)
                    .orElseThrow(() -> new MethodSignatureNotFoundException(this,methodName,arguments));
        }
        return getMethodCallSignature(methodName, arguments);
    }


    public FunctionSignature getMethodCallSignature(String identifier,List<Argument> arguments) {
        if(identifier.equals("super")){
            return new FunctionSignature("super", Collections.emptyList(), BultInType.VOID);
        }
        return functionSignatures.stream()
                .filter(signature -> signature.matches(identifier,arguments))
                .findFirst()
                .orElseThrow(() -> new MethodSignatureNotFoundException(this, identifier,arguments));
    }

    private String getSuperClassName() {
        return metaData.getSuperClassName();
    }

    public void addLocalVariable(LocalVariable variable) {
        localVariables.put(variable.getName(),variable);
    }

    public LocalVariable getLocalVariable(String varName) {
        return Optional.ofNullable(localVariables.get(varName))
                .orElseThrow(() -> new LocalVariableNotFoundException(this, varName));
    }

    public int getLocalVariableIndex(String varName) {
        return localVariables.indexOf(varName);
    }

    public boolean isLocalVariableExists(String varName) {
        return localVariables.containsKey(varName);
    }

    public void addField(Field field) {
        fields.put(field.getName(),field);
    }
    public Field getField(String fieldName) {
        return Optional.ofNullable(fields.get(fieldName))
                .orElseThrow(() -> new FieldNotFoundException(this, fieldName));
    }
    public boolean isFieldExists(String varName) {
        return fields.containsKey(varName);
    }

    public String getClassName() {
        return metaData.getClassName();
    }

    public String getSuperClassInternalName() {
        return new ClassType(getSuperClassName()).getInternalName();
    }

    public Type getClassType() {
        String className = getClassName();
        return new ClassType(className);
    }

    public String getClassInternalName() {
        return getClassType().getInternalName();
    }

}
