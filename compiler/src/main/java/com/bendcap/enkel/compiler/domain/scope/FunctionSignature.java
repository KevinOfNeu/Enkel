package com.bendcap.enkel.compiler.domain.scope;

import com.bendcap.enkel.compiler.domain.expression.FunctionParameter;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.exception.ParameterForNameNotFoundException;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by KevinOfNeu on 2018/8/22  09:39.
 */
public class FunctionSignature {
    private String name;
    private List<FunctionParameter> parameters;
    private Type returnType;

    public FunctionSignature(String name, List<FunctionParameter> parameters, Type returnType) {
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getParameters() {
        return parameters;
    }

    public FunctionParameter getParameterForName(String name) {
        return parameters.stream()
                .filter(param -> param.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new ParameterForNameNotFoundException(name, parameters));
    }

    public int getIndexOfParameters(String parameterName) {
        FunctionParameter parameter = getParameterForName(parameterName);
        return parameters.indexOf(parameter);
    }

    public boolean matches(String otherSignatureName, List<Type> otherSignatureParams) {
        boolean namesAreEqual = this.name.equals(otherSignatureName);
        if (!namesAreEqual) return false;
        List<Type> paramTypes = parameters.stream().map(p -> p.getType()).collect(toList());
        boolean sameParameterTypes = paramTypes.containsAll(otherSignatureParams) && otherSignatureParams.containsAll(paramTypes);
        return sameParameterTypes;
    }

    public Type getReturnType() {
        return returnType;
    }
}
