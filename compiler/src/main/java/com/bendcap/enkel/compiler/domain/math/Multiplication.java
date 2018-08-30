package com.bendcap.enkel.compiler.domain.math;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/23  16:53.
 */
public class Multiplication extends ArthimeticExpression{
    public Multiplication(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
