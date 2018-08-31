package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.PrintStatement;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:25.
 */
public class PrintStatementVisitor extends EnkelBaseVisitor<PrintStatement> {
    private final ExpressionVisitor expressionVisitor;
    public PrintStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public PrintStatement visitPrintStatement(@NotNull EnkelParser.PrintStatementContext ctx) {
        EnkelParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        return new PrintStatement(expression);
    }
}
