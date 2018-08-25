package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/22  09:33.
 */
public class FunctionParameter extends Expression {
    private final String name;
    private Optional<Expression> defaultValue;

    public FunctionParameter(String name, Type type, Optional<Expression> defaultValue) {
        super(type);
        this.name = name;
        this.defaultValue = defaultValue;
    }

    public String getName() {
        return name;
    }

    public Optional<Expression> getDefaultValue() {
        return defaultValue;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
