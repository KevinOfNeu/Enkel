package com.bendcap.enkel.antlr.domain.statement;

import com.bendcap.enkel.antlr.domain.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/22  10:06.
 */
public class VariableDeclarationStatement implements Statement {
    private String name;
    private Expression expression;

    public VariableDeclarationStatement(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }
}
