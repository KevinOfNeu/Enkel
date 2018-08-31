package com.bendcap.enkel.compiler.domain.node.statement;


import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/24  11:41.
 */
public class ReturnStatement implements Statement {
    private Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    public Expression getExpression() {
        return expression;
    }
}
