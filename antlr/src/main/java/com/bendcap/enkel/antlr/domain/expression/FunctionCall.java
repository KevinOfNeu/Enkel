package com.bendcap.enkel.antlr.domain.expression;

import com.bendcap.enkel.antlr.domain.scope.FunctionSignature;
import com.bendcap.enkel.antlr.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/22  10:12.
 */
public class FunctionCall extends Expression {
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
}

