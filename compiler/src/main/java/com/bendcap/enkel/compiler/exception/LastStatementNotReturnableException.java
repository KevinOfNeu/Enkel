package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.node.statement.Statement;

/**
 * Created by KevinOfNeu on 2018/8/24  13:14.
 */
public class LastStatementNotReturnableException extends RuntimeException {
    public LastStatementNotReturnableException(Statement lastStatement) {
        super("The statement " + lastStatement + " is a last statement in a functon, but it is not an expression!");
    }
}
