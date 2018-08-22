package com.bendcap.enkel.antlr.domain.expression;

import com.bendcap.enkel.antlr.domain.statement.Statement;
import com.bendcap.enkel.antlr.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  09:26.
 */
public abstract class Expression implements Statement {
    private Type type;

    public Expression(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
