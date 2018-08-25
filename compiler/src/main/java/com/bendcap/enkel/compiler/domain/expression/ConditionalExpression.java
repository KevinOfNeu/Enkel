package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.CompareSign;
import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;

/**
 * Created by KevinOfNeu on 2018/8/24  22:56.
 */
public class ConditionalExpression extends Expression {

    private CompareSign compareSign;
    private Expression leftExpression;
    private Expression rightExpression;

    public ConditionalExpression(Expression leftExpression, Expression rightExpression, CompareSign compareSign) {
        super(BuiltInType.BOOLEAN);
        this.compareSign = compareSign;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }


    public CompareSign getCompareSign() {
        return compareSign;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
