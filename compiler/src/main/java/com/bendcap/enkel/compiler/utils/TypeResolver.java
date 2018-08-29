package com.bendcap.enkel.compiler.utils;

import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
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
            return BuiltInType.INT;
        }
        return BuiltInType.STRING;
    }


    private static Optional<BuiltInType> getBuiltInType(String typeName) {
        return Arrays.stream(BuiltInType.values())
                .filter(type -> type.getName().equals(typeName))
                .findFirst();
    }
}
