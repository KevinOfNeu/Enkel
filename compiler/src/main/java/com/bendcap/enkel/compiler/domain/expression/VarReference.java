package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

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

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
