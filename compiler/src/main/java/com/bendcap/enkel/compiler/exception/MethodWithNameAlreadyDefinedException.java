package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;

/**
 * Created by KevinOfNeu on 2018/8/31  12:12.
 */
public class MethodWithNameAlreadyDefinedException extends RuntimeException{
    public MethodWithNameAlreadyDefinedException(FunctionSignature signature) {
        super("Method already defined in scope :" + signature);
    }
}
