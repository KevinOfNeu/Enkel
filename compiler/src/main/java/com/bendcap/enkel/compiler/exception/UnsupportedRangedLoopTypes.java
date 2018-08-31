package com.bendcap.enkel.compiler.exception;


import com.bendcap.enkel.compiler.domain.node.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/29  17:42.
 */
public class UnsupportedRangedLoopTypes extends RuntimeException {
    public UnsupportedRangedLoopTypes(Expression startExpression, Expression endExpression) {
        super("Only integer types are supported so far");
    }
}
