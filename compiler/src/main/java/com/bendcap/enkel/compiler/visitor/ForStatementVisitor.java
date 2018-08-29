package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.AssignmentStatement;
import com.bendcap.enkel.compiler.domain.statement.RangedForStatement;
import com.bendcap.enkel.compiler.domain.statement.Statement;
import com.bendcap.enkel.compiler.domain.statement.VariableDeclarationStatement;

/**
 * Created by KevinOfNeu on 2018/8/29  17:44.
 */
public class ForStatementVisitor extends EnkelBaseVisitor<RangedForStatement> {
    private Scope scope;
    private ExpressionVisitor expressionVisitor;
    private StatementVisitor statementVisitor;

    public ForStatementVisitor(Scope scope) {
        this.scope = new Scope(scope);
        expressionVisitor = new ExpressionVisitor(this.scope);
        statementVisitor = new StatementVisitor(this.scope);
    }

    @Override
    public RangedForStatement visitForStatement(EnkelParser.ForStatementContext ctx) {
        EnkelParser.ForConditionsContext forConditionsContext = ctx.forConditions();
        Expression startExpression = forConditionsContext.startExpr.accept(expressionVisitor);
        Expression endExpression = forConditionsContext.endExpr.accept(expressionVisitor);
        EnkelParser.VariableReferenceContext iterator = forConditionsContext.iterator;
        String varName = iterator.getText();
        if (scope.localVariableExists(varName)) {
            Statement iteratorVariable = new AssignmentStatement(varName, startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression, statement, varName, scope);
        } else {
            scope.addLocalVariable(new LocalVariable(varName, startExpression.getType()));
            Statement iteratorVariable = new VariableDeclarationStatement(varName, startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression, statement, varName, scope);
        }
    }
}
