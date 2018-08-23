package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.expression.FunctionCall;
import com.bendcap.enkel.compiler.domain.scope.Scope;

/**
 * Created by KevinOfNeu on 2018/8/22  15:23.
 */
public class CalledFunctionDoesNotExistException extends CompilationException {
    FunctionCall functionCall;

    public CalledFunctionDoesNotExistException(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public CalledFunctionDoesNotExistException(FunctionCall functionCall, ReflectiveOperationException e) {
        this(functionCall);
    }

    public CalledFunctionDoesNotExistException(FunctionCall functionCall, Scope scope) {
        this(functionCall);
    }

    @Override
    public String getMessage() {
        return "Function call" + functionCall.toString() + "does not exists";
    }
}
