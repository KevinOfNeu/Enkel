package com.bendcap.enkel.compiler.domain.node.expression.arthimetic;


import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/23  16:53.
 */
public class Substraction extends ArthimeticExpression {
    public Substraction(Expression leftExpress, Expression rightExpress) {
        super(leftExpress, rightExpress);
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
