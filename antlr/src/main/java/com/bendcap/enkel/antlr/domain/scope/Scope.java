package com.bendcap.enkel.antlr.domain.scope;

import com.bendcap.enkel.antlr.domain.global.MetaData;
import com.bendcap.enkel.antlr.exception.LocalVariableNotFoundException;
import com.bendcap.enkel.antlr.exception.MethodSignatureNotFoundException;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  09:37.
 */
public class Scope {
    private List<LocalVariable> localVariables;
    private List<FunctionSignature> functionSignatures;
    private MetaData metaData;

    public Scope(MetaData metaData) {
        this.metaData = metaData;
        localVariables = new ArrayList<>();
        functionSignatures = new ArrayList<>();
    }

    public Scope(Scope scope) {
        metaData = scope.metaData;
        localVariables = new ArrayList<>();
        functionSignatures = Lists.newArrayList(scope.functionSignatures);
    }

    public void addSignature(FunctionSignature signature) {
        functionSignatures.add(signature);
    }

    public FunctionSignature getSignature(String methodName) {
        return functionSignatures.stream()
                .filter(signature -> signature.getName().equals(methodName))
                .findFirst()
                .orElseThrow(() -> new MethodSignatureNotFoundException(this, methodName));
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

    public int getLocalVariableIndex(String varName) {
        LocalVariable localVariable = getLocalVariable(varName);
        return localVariables.indexOf(localVariable);
    }

    public String getClassName() {
        return metaData.getClassName();
    }

}
