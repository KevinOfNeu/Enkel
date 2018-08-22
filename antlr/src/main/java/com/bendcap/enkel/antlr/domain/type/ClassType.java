package com.bendcap.enkel.antlr.domain.type;

/**
 * Created by KevinOfNeu on 2018/8/22  09:57.
 */
public class ClassType implements Type {
    private String name;

    public ClassType(String name) {
        this.name = name;
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
}
