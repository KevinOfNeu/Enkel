package com.bendcap.enkel.compiler.domain.math;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/23  16:46.
 */
public class Addition extends ArthimeticExpression {
    public Addition(Expression leftExpression, Expression rightExpression) {
        super(leftExpression.getType(), leftExpression, rightExpression);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
