package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

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

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
