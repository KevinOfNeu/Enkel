package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.scope.Scope;

/**
 * Created by KevinOfNeu on 2018/8/31  22:18.
 */
public class FieldNotFoundException extends RuntimeException {
    public FieldNotFoundException(Scope scope, String fieldName) {
        super("No field found for name " + fieldName + " found in scope" + scope);
    }
}
