package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.CompareSign;
import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/24  22:56.
 */
public class ConditionalExpression implements Expression {

    private CompareSign compareSign;
    private Expression leftExpression;
    private Expression rightExpression;
    private Type type;

    public ConditionalExpression(Expression leftExpression, Expression rightExpression, CompareSign compareSign) {
        this.type = BuiltInType.BOOLEAN;
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

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
