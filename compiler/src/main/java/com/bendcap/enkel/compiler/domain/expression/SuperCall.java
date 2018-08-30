package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/30  15:59.
 */
public class SuperCall implements Call {
    public static final String SUPER_IDENTIFIER = "super";
    private List<Expression> arguments;

    public SuperCall() {
        this(Collections.emptyList());
    }

    public SuperCall(List<Expression> arguments) {
        this.arguments = arguments;
    }

    @Override
    public List<Expression> getArguments() {
        return arguments;
    }

    @Override
    public String getIdentifier() {
        return SUPER_IDENTIFIER;
    }

    @Override
    public Type getType() {
        return BuiltInType.VOID;
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
