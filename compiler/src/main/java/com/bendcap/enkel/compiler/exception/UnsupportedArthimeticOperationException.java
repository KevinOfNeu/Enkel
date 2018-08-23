package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.math.ArthimeticExpression;

/**
 * Created by KevinOfNeu on 2018/8/23  16:17.
 */
public class UnsupportedArthimeticOperationException extends RuntimeException{
    public UnsupportedArthimeticOperationException(ArthimeticExpression expression) {
        super(prepareMesage(expression));
    }
    private static String prepareMesage(ArthimeticExpression expression) {
        Expression leftExpression = expression.getLeftExpression();
        Expression rightExpression = expression.getRightExpression();
        return "Unsupported arthimetic operation between " + leftExpression +" and "+rightExpression;
    }
}
