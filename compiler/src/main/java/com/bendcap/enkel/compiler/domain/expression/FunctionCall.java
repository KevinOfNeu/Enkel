package com.bendcap.enkel.compiler.domain.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.statement.Statement;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/22  10:12.
 */
public class FunctionCall extends Expression implements Statement {
    private Type owner;
    private FunctionSignature signature;
    private Collection<Expression> parameters;

    public FunctionCall(FunctionSignature signature, Collection<Expression> parameters, Type owner) {
        super(signature.getReturnType());
        this.signature = signature;
        this.parameters = parameters;
        this.owner = owner;
    }

    public String getFunctionName() {
        return signature.getName();
    }

    public FunctionSignature getSignature() {
        return signature;
    }

    public Optional<Type> getOwner() {
        return Optional.ofNullable(owner);
    }

    public Collection<Expression> getParameters() {
        return Collections.unmodifiableCollection(parameters);
    }


    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}

