package com.bendcap.enkel.compiler.domain.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/29  17:39.
 */
public class AssignmentStatement implements Statement {
    private String varName;
    private Expression expression;

    public AssignmentStatement(String varName, Expression expression) {
        this.varName = varName;
        this.expression = expression;
    }

    public AssignmentStatement(VariableDeclarationStatement declarationStatement) {
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
