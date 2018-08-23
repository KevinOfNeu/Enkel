package com.bendcap.enkel.compiler.utils;

import com.bendcap.enkel.compiler.domain.clazz.Function;
import com.bendcap.enkel.compiler.domain.expression.FunctionParameter;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by KevinOfNeu on 2018/8/22  14:57.
 */
public class DecriptorFactory {

    public static String getMethodDescriptor(Function function) {
        Collection<FunctionParameter> arguments = function.getArguments();
        Type returnType = function.getReturnType();
        return getMethodDescriptor(arguments, returnType);
    }

    public static String getMethodDescriptor(FunctionSignature signature) {
        Collection<FunctionParameter> arguments = signature.getArguments();
        Type returnType = signature.getReturnType();
        return getMethodDescriptor(arguments, returnType);
    }

    private static String getMethodDescriptor(Collection<FunctionParameter> argumanets, Type returnType) {
        String argumentDescriptor = argumanets.stream()
                .map(argument -> argument.getType().getDescriptor())
                .collect(Collectors.joining("", "(", ")"));
        String returnDescriptor = returnType.getDescriptor();
        return argumentDescriptor + returnDescriptor;
    }
}
