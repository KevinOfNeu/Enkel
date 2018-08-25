package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.expression.FunctionCall;

/**
 * Created by KevinOfNeu on 2018/8/25  19:38.
 */
public class BadArgumentsToFunctionCallException extends RuntimeException {
    public BadArgumentsToFunctionCallException(FunctionCall functionCall) {
    }
}
