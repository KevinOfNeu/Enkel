package com.bendcap.enkel.compiler.domain.scope;

import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  09:38.
 */
public class LocalVariable implements Variable{
    private String name;
    private Type type;

    public LocalVariable(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
