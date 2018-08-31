package com.bendcap.enkel.compiler.domain.scope;

import com.bendcap.enkel.compiler.domain.MetaData;
import com.bendcap.enkel.compiler.domain.node.expression.Argument;
import com.bendcap.enkel.compiler.domain.type.BultInType;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.exception.ClassNotFoundForNameException;
import com.bendcap.enkel.compiler.exception.LocalVariableNotFoundException;
import com.bendcap.enkel.compiler.exception.MethodSignatureNotFoundException;
import com.bendcap.enkel.compiler.exception.MethodWithNameAlreadyDefinedException;
import com.bendcap.enkel.compiler.utils.ReflectionObjectToSignatureMapper;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.lang3.reflect.MethodUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;


/**
 * Created by KevinOfNeu on 2018/8/22  09:37.
 */
public class Scope {
    private final List<LocalVariable> localVariables;
    private final List<FunctionSignature> functionSignatures;
    private final MetaData metaData;

    public Scope(MetaData metaData) {
        localVariables = new ArrayList<>();
        functionSignatures = new ArrayList<>();
        this.metaData = metaData;
    }

    public Scope(Scope scope) {
        metaData = scope.metaData;
        localVariables =  Lists.newArrayList(scope.localVariables);
        functionSignatures = Lists.newArrayList(scope.functionSignatures);
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

    public void addLocalVariable(LocalVariable localVariable) {
        localVariables.add(localVariable);
    }

    public LocalVariable getLocalVariable(String varName) {
        return localVariables.stream()
                .filter(variable -> variable.getName().equals(varName))
                .findFirst()
                .orElseThrow(() -> new LocalVariableNotFoundException(this, varName));
    }

    public boolean isLocalVariableExists(String varName) {
        return localVariables.stream()
                .anyMatch(variable -> variable.getName().equals(varName));
    }

    public int getLocalVariableIndex(String varName) {
        LocalVariable localVariable = getLocalVariable(varName);
        return localVariables.indexOf(localVariable);
    }

    Optional<FunctionSignature> getSignatureOnClassPath(String fullMethodName) {
        String methodName = StringUtils.removePattern(fullMethodName,".*\\.");
        String className = fullMethodName; // StringUtils.difference(fullMethodName, methodName);
        Class<?> methodOwnerClass = null;
        try {
            methodOwnerClass = ClassUtils.getClass(className);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundForNameException(className);
        }
        Method accessibleMethod = MethodUtils.getAccessibleMethod(methodOwnerClass, methodName);
        if(accessibleMethod != null) {
            FunctionSignature signature = ReflectionObjectToSignatureMapper.fromMethod(accessibleMethod);
            return Optional.of(signature);
        }
        Constructor<?> accessibleConstructor = ConstructorUtils.getAccessibleConstructor(methodOwnerClass);
        if(accessibleConstructor != null) {
            FunctionSignature signature = ReflectionObjectToSignatureMapper.fromConstructor(accessibleConstructor);
            return Optional.of(signature);
        }
        return Optional.empty();
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
