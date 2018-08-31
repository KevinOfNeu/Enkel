package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.node.expression.Argument;
import com.bendcap.enkel.compiler.domain.node.expression.Parameter;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/31  12:14.
 */
public class WrongArgumentNameException extends RuntimeException{
    public WrongArgumentNameException(Argument argument, List<Parameter> parameters) {
        super("You are trying to call method with argument name" + argument.getParameterName().get() + " where parameters = " + parameters);
    }
}
