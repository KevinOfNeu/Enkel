package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.Assignment;
import com.bendcap.enkel.compiler.domain.node.statement.VariableDeclaration;

/**
 * Created by KevinOfNeu on 2018/8/31  11:48.
 */
public class VariableDeclarationStatementGenerator {
    private final StatementGenerator statementGenerator;
    private final ExpressionGenerator expressionGenerator;
    public VariableDeclarationStatementGenerator(StatementGenerator statementGenerator, ExpressionGenerator expressionGenerator) {
        this.statementGenerator = statementGenerator;
        this.expressionGenerator = expressionGenerator;
    }
    public void generate(VariableDeclaration variableDeclaration) {
        Expression expression = variableDeclaration.getExpression();
        expression.accept(expressionGenerator);
        Assignment assignment = new Assignment(variableDeclaration);
        assignment.accept(statementGenerator);
    }
}
