package com.bendcap.enkel.compiler.domain.node.statement;


import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/29  17:39.
 */
public class Assignment implements Statement {
    private String varName;
    private Expression expression;

    public Assignment(String varName, Expression expression) {
        this.varName = varName;
        this.expression = expression;
    }

    public Assignment(VariableDeclaration declarationStatement) {
        this.varName = declarationStatement.getName();
        this.expression = declarationStatement.getExpression();
    }


    public String getVarName() {
        return varName;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
