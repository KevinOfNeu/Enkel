package com.bendcap.enkel.compiler.utils;

import com.bendcap.enkel.compiler.domain.type.BultInType;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/9/1  23:09.
 */
public class PrimitiveTypesWrapperFactory {
    private final static BiMap<BultInType, ClassType> types = ImmutableBiMap.of(
            BultInType.INT, ClassType.Integer(),
            BultInType.BOOLEAN, ClassType.Boolean(),
            BultInType.FLOAT, ClassType.Float(),
            BultInType.DOUBLE, ClassType.Double()
    );
    private final static Map<Type, String> toPrimitiveMethodName = ImmutableMap.of(
            ClassType.Integer(), "intValue"
    );

    public static Optional<BultInType> getPrimitiveForWrapper(Type type) {
        return Optional.ofNullable(types.inverse().get(type));
    }

    public static Optional<ClassType> getWrapperForPrimitive(Type type) {
        return Optional.ofNullable(types.get(type));
    }
}
