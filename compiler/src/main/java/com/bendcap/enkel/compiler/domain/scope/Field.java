package com.bendcap.enkel.compiler.domain.scope;

import com.bendcap.enkel.compiler.bytecodegenerator.FieldGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/31  23:04.
 */
public class Field implements Variable {
    private final String name;
    private final Type owner;
    private final Type type;


    public Field(String name, Type owner, Type type) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getOwnerInternalName() {
        return owner.getInternalName();
    }

    public void accept(FieldGenerator generator) {
        generator.generate(this);
    }
}
