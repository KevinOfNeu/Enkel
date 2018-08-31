package com.bendcap.enkel.compiler.domain.scope;

import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.utils.ReflectionObjectToSignatureMapper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/31  17:00.
 */
public class ClassPathScope {
    public Optional<FunctionSignature> getMethodSignature(Type owner, String methodName, List<Type> arguments) {
        try {
            Class<?> methodOwnerClass = owner.getTypeClass();
            Class<?>[] params = arguments.stream()
                    .map(Type::getTypeClass).toArray(Class<?>[]::new);
            Method method = methodOwnerClass.getMethod(methodName, params);
            return Optional.of(ReflectionObjectToSignatureMapper.fromMethod(method));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public Optional<FunctionSignature> getConstructorSignature(String className, List<Type> arguments) {
        try {
            Class<?> methodOwnerClass = Class.forName(className);
            Class<?>[] params = arguments.stream()
                    .map(Type::getTypeClass).toArray(Class<?>[]::new);
            Constructor<?> constructor = methodOwnerClass.getConstructor(params);
            return Optional.of(ReflectionObjectToSignatureMapper.fromConstructor(constructor));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
