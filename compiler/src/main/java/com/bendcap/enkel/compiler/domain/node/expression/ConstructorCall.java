package com.bendcap.enkel.compiler.domain.node.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/30  15:29.
 */
@ToString
public class ConstructorCall implements Call {
    private List<Argument> arguments;
    private Type type;
    private String identifier;

    public ConstructorCall(String identifier) {
        this(identifier, Collections.emptyList());
    }

    public ConstructorCall(String className, List<Argument> arguments) {
        this.type = new ClassType(className);
        this.arguments = arguments;
        this.identifier = className;
    }

    @Override
    public void accept(ExpressionGenerator genrator) {
        genrator.generate(this);
    }

    @Override
    public List<Argument> getArguments() {
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
