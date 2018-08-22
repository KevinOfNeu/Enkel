package com.bendcap.enkel.antlr.domain.scope;

import com.bendcap.enkel.antlr.domain.expression.FunctionParameter;
import com.bendcap.enkel.antlr.domain.type.Type;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  09:39.
 */
public class FunctionSignature {
    private String name;
    private List<FunctionParameter> arguments;
    private Type returnType;

    public FunctionSignature(String name, List<FunctionParameter> arguments, Type returnType) {
        this.name = name;
        this.arguments = arguments;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getArguments() {
        return arguments;
    }

    public Type getReturnType() {
        return returnType;
    }
}
