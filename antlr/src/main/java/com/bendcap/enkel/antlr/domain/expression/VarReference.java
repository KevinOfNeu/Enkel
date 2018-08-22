package com.bendcap.enkel.antlr.domain.expression;

import com.bendcap.enkel.antlr.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  10:11.
 */
public class VarReference extends Expression {
    private String varName;

    public VarReference(String varName, Type type) {
        super(type);
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }
}
