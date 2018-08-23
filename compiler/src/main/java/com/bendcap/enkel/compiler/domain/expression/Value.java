package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  10:10.
 */
public class Value extends Expression {
    private String value;

    public Value(Type type, String value) {
        super(type);
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
