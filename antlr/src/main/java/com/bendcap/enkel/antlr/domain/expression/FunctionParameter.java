package com.bendcap.enkel.antlr.domain.expression;

import com.bendcap.enkel.antlr.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  09:33.
 */
public class FunctionParameter extends Expression {
    private final String name;

    public FunctionParameter(String name, Type type) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
