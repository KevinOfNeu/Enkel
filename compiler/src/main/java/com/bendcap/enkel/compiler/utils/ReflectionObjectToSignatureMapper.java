package com.bendcap.enkel.compiler.utils;

import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.type.BultInType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * Created by KevinOfNeu on 2018/8/30  16:07.
 */
public final class ReflectionObjectToSignatureMapper {
    public static FunctionSignature fromMethod(Method method) {
        String name = method.getName();
        List<Parameter> parameters = Arrays.stream(method.getParameters())
                .map(p -> new Parameter(p.getName(), TypeResolver.getFromTypeName(p.getType().getCanonicalName()), Optional.empty()))
                .collect(toList());
        Class<?> returnType = method.getReturnType();
        return new FunctionSignature(name, parameters, TypeResolver.getFromTypeName(returnType.getCanonicalName()));
    }

    public static FunctionSignature fromConstructor(Constructor constructor) {
        String name = constructor.getName();
        List<Parameter> parameters = Arrays.stream(constructor.getParameters())
                .map(p -> new Parameter(p.getName(), TypeResolver.getFromTypeName(p.getType().getCanonicalName()), Optional.empty()))
                .collect(toList());
        return new FunctionSignature(name, parameters, BultInType.VOID);
    }
}
