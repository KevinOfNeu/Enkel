package com.bendcap.enkel.compiler.utils;

import com.bendcap.enkel.compiler.domain.type.BultInType;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/29  23:45.
 */
public class TypeChecker {
    public static boolean isInt(Type type) {
        return type == BultInType.INT;
    }

    public static boolean isBool(Type type) {
        return type == BultInType.BOOLEAN;
    }

    public static boolean isFloat(Type type) {
        return type == BultInType.FLOAT;
    }

    public static boolean isDouble(Type type) {
        return type == BultInType.DOUBLE;
    }
}
