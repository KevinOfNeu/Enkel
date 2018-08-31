package com.bendcap.enkel.compiler.domain.node.expression.arthimetic;

import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.type.BultInType;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/23  16:42.
 */
public abstract class ArthimeticExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private Type type;

    public ArthimeticExpression(Expression leftExpression, Expression rightExpression) {
        this.type = getCommonType(leftExpression, rightExpression);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    private static Type getCommonType(Expression leftExpression, Expression rightExpression) {
        if (rightExpression.getType() == BultInType.STRING) return BultInType.STRING;
        return leftExpression.getType();
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public Type getType() {
        return type;
    }
}
