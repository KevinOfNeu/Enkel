package com.bendcap.enkel.antlr.domain.scope;

import com.bendcap.enkel.antlr.domain.expression.Expression;
import com.bendcap.enkel.antlr.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  09:38.
 */
public class LocalVariable extends Expression {
    private String name;

    public LocalVariable(String name, Type type) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
