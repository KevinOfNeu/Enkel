package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.node.expression.Call;

/**
 * Created by KevinOfNeu on 2018/8/25  19:38.
 */
public class BadArgumentsToFunctionCallException extends RuntimeException {
    public BadArgumentsToFunctionCallException(Call functionCall) {
    }
}
