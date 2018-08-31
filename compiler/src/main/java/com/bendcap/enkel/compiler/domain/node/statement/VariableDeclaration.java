package com.bendcap.enkel.compiler.domain.node.statement;


import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/22  10:06.
 */
public class VariableDeclaration implements Statement {
    private String name;
    private Expression expression;

    public VariableDeclaration(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
