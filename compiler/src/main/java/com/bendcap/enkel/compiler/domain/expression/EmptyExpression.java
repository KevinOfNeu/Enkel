package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/24  11:39.
 */
public class EmptyExpression extends Expression {
    public EmptyExpression(Type type) {
        super(type);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
