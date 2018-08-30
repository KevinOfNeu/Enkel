package com.bendcap.enkel.compiler.domain.math;

import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/23  16:42.
 */
public abstract class ArthimeticExpression extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public ArthimeticExpression(Expression leftExpression, Expression rightExpression) {
        super(getCommonType(leftExpression, rightExpression));
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    private static Type getCommonType(Expression leftExpression, Expression rightExpression) {
        if (rightExpression.getType() == BuiltInType.STRING) return BuiltInType.STRING;
        return leftExpression.getType();
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
