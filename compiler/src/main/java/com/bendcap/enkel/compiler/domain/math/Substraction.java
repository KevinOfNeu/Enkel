package com.bendcap.enkel.compiler.domain.math;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/23  16:53.
 */
public class Substraction extends ArthimeticExpression {
    public Substraction(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }


    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
