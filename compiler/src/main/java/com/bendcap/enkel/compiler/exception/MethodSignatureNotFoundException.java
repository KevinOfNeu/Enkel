package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  09:46.
 */
public class MethodSignatureNotFoundException extends RuntimeException {
    public MethodSignatureNotFoundException(Scope scope, String methodName, List<Type> parameterTypes) {
        super("There is no method " + methodName + " with parameters " + parameterTypes);
    }
}
