package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.IfStatement;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:24.
 */
public class IfStatementVisitor extends EnkelBaseVisitor<IfStatement> {
    private final StatementVisitor statementVisitor;
    private final ExpressionVisitor expressionVisitor;
    public IfStatementVisitor(StatementVisitor statementVisitor, ExpressionVisitor expressionVisitor) {
        this.statementVisitor = statementVisitor;
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public IfStatement visitIfStatement(@NotNull EnkelParser.IfStatementContext ctx) {
        EnkelParser.ExpressionContext conditionalExpressionContext = ctx.expression();
        Expression condition = conditionalExpressionContext.accept(expressionVisitor);
        Statement trueStatement = ctx.trueStatement.accept(statementVisitor);
        if (ctx.falseStatement != null) {
            Statement falseStatement = ctx.falseStatement.accept(statementVisitor);
            return new IfStatement(condition, trueStatement, falseStatement);
        }
        return new IfStatement(condition, trueStatement);
    }
}
