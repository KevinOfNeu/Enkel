package com.bendcap.enkel.compiler.domain.node.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  10:11.
 */
public class VariableReference implements Expression {
    private String varName;
    private Type type;

    public VariableReference(String varName, Type type) {
        this.type = type;
        this.varName = varName;
    }

    public String geName() {
        return varName;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public Type getType() {
        return type;
    }
}
