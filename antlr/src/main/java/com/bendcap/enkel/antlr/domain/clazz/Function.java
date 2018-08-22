package com.bendcap.enkel.antlr.domain.clazz;

import com.bendcap.enkel.antlr.domain.expression.Expression;
import com.bendcap.enkel.antlr.domain.expression.FunctionParameter;
import com.bendcap.enkel.antlr.domain.scope.Scope;
import com.bendcap.enkel.antlr.domain.statement.Statement;
import com.bendcap.enkel.antlr.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  09:25.
 */
public class Function extends Expression {
    private String name;
    private List<FunctionParameter> arguments;
    private List<Statement> statements;
    private Scope scope;

    public Function(Scope scope, String name, Type returnType, List<FunctionParameter> arguments, List<Statement> statements) {
        super(returnType);
        this.scope = scope;
        this.name = name;
        this.arguments = arguments;
        this.statements = statements;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    public Collection<Statement> getStatements() {
        return Collections.unmodifiableCollection(statements);
    }

    public Scope getScope() {
        return scope;
    }
}
