package com.bendcap.enkel.compiler.exception;

/**
 * Created by KevinOfNeu on 2018/8/30  15:30.
 */
public class FunctionNameEqualClassException extends RuntimeException {
    public FunctionNameEqualClassException(String functionName) {
        super("Function name cannot be same as the class : " + functionName);
    }
}
