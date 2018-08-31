package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.node.statement.Assignment;
import com.bendcap.enkel.compiler.domain.node.statement.RangedForStatement;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.domain.node.statement.VariableDeclaration;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;

/**
 * Created by KevinOfNeu on 2018/8/29  17:44.
 */
public class ForStatementVisitor extends EnkelBaseVisitor<RangedForStatement> {
    private Scope scope;
    private ExpressionVisitor expressionVisitor;

    public ForStatementVisitor(Scope scope) {
        this.scope = scope;
        expressionVisitor = new ExpressionVisitor(this.scope);
    }

    @Override
    public RangedForStatement visitForStatement(EnkelParser.ForStatementContext ctx) {
        Scope newScope = new Scope(scope);
        EnkelParser.ForConditionsContext forConditionsContext = ctx.forConditions();
        Expression startExpression = forConditionsContext.startExpr.accept(expressionVisitor);
        Expression endExpression = forConditionsContext.endExpr.accept(expressionVisitor);
        EnkelParser.VariableReferenceContext iterator = forConditionsContext.iterator;
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        String varName = iterator.getText();
        if(newScope.isLocalVariableExists(varName)) {
            Statement iteratorVariable = new Assignment(varName, startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName, newScope);
        } else {
            newScope.addLocalVariable(new LocalVariable(varName, startExpression.getType()));
            Statement iteratorVariable = new VariableDeclaration(varName, startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName,newScope);
        }
    }
}
