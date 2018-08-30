package com.bendcap.enkel.compiler.utils;

import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.domain.type.TypeChecker;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/22  11:00.
 */
public class TypeResolver {
    public static Type getFromTypeName(EnkelParser.TypeContext typeContext) {
        if (typeContext == null) return BuiltInType.VOID;
        String typeName = typeContext.getText();
        if (typeName.equals("java.lang.String")) return BuiltInType.STRING;
        Optional<? extends Type> buildInType = getBuiltInType(typeName);
        if (buildInType.isPresent()) return buildInType.get();
        return new ClassType(typeName);
    }

    public static Type getFromValue(String value) {
        if (StringUtils.isEmpty(value)) return BuiltInType.VOID;
        if (NumberUtils.isNumber(value)) {
            if (Ints.tryParse(value) != null) {
                return BuiltInType.INT;
            } else if (Floats.tryParse(value) != null) {
                return BuiltInType.FLOAT;
            } else if (Doubles.tryParse(value) != null) {
                return BuiltInType.DOUBLE;
            }
        } else if (BooleanUtils.toBoolean(value)) {
            return BuiltInType.BOOLEAN;
        }
        return BuiltInType.STRING;
    }

    public static Object getValueFromString(String stringValue, Type type) {
        if (TypeChecker.isInt(type)) {
            return Integer.valueOf(stringValue);
        } else if (TypeChecker.isFloat(type)) {
            return Float.valueOf(stringValue);
        } else if (TypeChecker.isDouble(type)) {
            return Double.valueOf(stringValue);
        } else if (TypeChecker.isBool(type)) {
            return Boolean.valueOf(stringValue);
        } else if (type == BuiltInType.STRING) {
            stringValue = StringUtils.removeStart(stringValue, "\"");
            stringValue = StringUtils.removeEnd(stringValue, "\"");
            return stringValue;
        } else {
            throw new AssertionError("Objects not yet implemented!");
        }
    }

    private static Optional<BuiltInType> getBuiltInType(String typeName) {
        return Arrays.stream(BuiltInType.values())
                .filter(type -> type.getName().equals(typeName))
                .findFirst();
    }
}
