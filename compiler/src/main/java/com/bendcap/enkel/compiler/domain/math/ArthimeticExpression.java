package com.bendcap.enkel.compiler.domain.math;

import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.exception.UnsupportedArthimeticOperationException;

/**
 * Created by KevinOfNeu on 2018/8/23  16:42.
 */
public abstract class ArthimeticExpression extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public ArthimeticExpression(Type type, Expression leftExpression, Expression rightExpression) {
        super(type);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        if (type != BuiltInType.INT) {
            throw new UnsupportedArthimeticOperationException(this);
        }
    }


    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
