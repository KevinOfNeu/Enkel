package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/24  23:00.
 */
public class ComparisonBetweenDiferentTypesException extends RuntimeException {
    public ComparisonBetweenDiferentTypesException(Expression leftExpression, Expression rightExpression) {
        super("Comparison between types " + leftExpression.getType() + " and " + rightExpression.getType() + " not yet supported");
    }
}
