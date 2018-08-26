package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.expression.FunctionParameter;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/26  21:58.
 */
public class ParameterForNameNotFoundException extends RuntimeException{
    public ParameterForNameNotFoundException(String name, List<FunctionParameter> parameters) {
    }
}
