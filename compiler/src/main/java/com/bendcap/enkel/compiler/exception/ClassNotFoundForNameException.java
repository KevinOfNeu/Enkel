package com.bendcap.enkel.compiler.exception;

/**
 * Created by KevinOfNeu on 2018/8/30  15:30.
 */
public class ClassNotFoundForNameException extends RuntimeException {
    public ClassNotFoundForNameException(String className) {
        super("class not found " + className);
    }
}
