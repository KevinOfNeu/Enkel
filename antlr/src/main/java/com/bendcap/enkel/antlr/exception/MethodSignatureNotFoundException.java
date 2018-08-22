package com.bendcap.enkel.antlr.exception;

import com.bendcap.enkel.antlr.domain.scope.Scope;

/**
 * Created by KevinOfNeu on 2018/8/22  09:46.
 */
public class MethodSignatureNotFoundException extends RuntimeException {
    public MethodSignatureNotFoundException(Scope scope, String methodName) {
        super("There is no method" + methodName);
    }
}
