package com.bendcap.enkel.compiler.domain.type;

import com.google.common.collect.ImmutableMap;
import lombok.ToString;
import org.objectweb.asm.Opcodes;

import java.util.Map;
import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/22  09:57.
 */
@ToString
public class ClassType implements Type {
    private String name;

    private static final Map<String, String> shortcuts = ImmutableMap.of(
            "List", "java.util.ArrayList"
    );

    public ClassType(String name) {
        this.name = Optional.ofNullable(shortcuts.get(name)).orElse(name);
    }

    public static ClassType Integer() {
        return new ClassType("java.lang.Integer");
    }

    public static ClassType Double() {
        return new ClassType("java.lang.Double");
    }

    public static ClassType Boolean() {
        return new ClassType("java.lang.Boolean");
    }

    public static ClassType Float() {
        return new ClassType("java.lang.Float");
    }

    public static Type String() {
        return new ClassType("java.lang.String");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Class<?> getTypeClass() {
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public String getDescriptor() {
        return "L" + getInternalName() + ";";
    }

    @Override
    public String getInternalName() {
        return name.replace(".", "/");
    }

    @Override
    public int getLoadVariableOpcode() {
        return Opcodes.ALOAD;
    }

    @Override
    public int getStoreVariableOpcode() {
        return Opcodes.ASTORE;
    }

    @Override
    public int getReturnOpcode() {
        return Opcodes.ARETURN;
    }

    @Override
    public int getAddOpcode() {
        throw new RuntimeException("Addition operation not (yet ;) ) supported for custom objects");
    }

    @Override
    public int getSubstractOpcode() {
        throw new RuntimeException("Substraction operation not (yet ;) ) supported for custom objects");
    }

    @Override
    public int getMultiplyOpcode() {
        throw new RuntimeException("Multiplcation operation not (yet ;) ) supported for custom objects");
    }

    @Override
    public int getDividOpcode() {
        throw new RuntimeException("Division operation not (yet ;) ) supported for custom objects");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassType classType = (ClassType) o;
        return !(name != null ? !name.equals(classType.name) : classType.name != null);
    }
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
