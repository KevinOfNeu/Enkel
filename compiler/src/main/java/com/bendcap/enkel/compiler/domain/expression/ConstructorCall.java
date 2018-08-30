package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/30  15:29.
 */
public class ConstructorCall implements Call{
    private List<Expression> arguments;
    private Type type;
    private String identifier;

    public ConstructorCall(String identifier) {
        this(identifier, Collections.emptyList());
    }

    public ConstructorCall(String className, List<Expression> arguments) {
        this.type = new ClassType(className);
        this.arguments = arguments;
        this.identifier = className;
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public List<Expression> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Type getType() {
        return type;
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
