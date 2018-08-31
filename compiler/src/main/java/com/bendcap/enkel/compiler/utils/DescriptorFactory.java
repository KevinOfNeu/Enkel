package com.bendcap.enkel.compiler.utils;

import com.bendcap.enkel.compiler.domain.Function;
import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by KevinOfNeu on 2018/8/22  14:57.
 */
public class DescriptorFactory {

    public static String getMethodDescriptor(Function function) {
        Collection<Parameter> parameters = function.getParameters();
        Type returnType = function.getReturnType();
        return getMethodDescriptor(parameters, returnType);
    }

    public static String getMethodDescriptor(FunctionSignature signature) {
        Collection<Parameter> parameters = signature.getParameters();
        Type returnType = signature.getReturnType();
        return getMethodDescriptor(parameters, returnType);
    }

    private static String getMethodDescriptor(Collection<Parameter> parameters, Type returnType) {
        String parametersDescriptor = parameters.stream()
                .map(parameter -> parameter.getType().getDescriptor())
                .collect(Collectors.joining("", "(", ")"));
        String returnDescriptor = returnType.getDescriptor();
        return parametersDescriptor + returnDescriptor;
    }
}
