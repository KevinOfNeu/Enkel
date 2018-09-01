package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.Assignment;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  23:11.
 */
public class AssignmentStatementVisitor extends EnkelBaseVisitor<Assignment> {
    private final ExpressionVisitor expressionVisitor;

    public AssignmentStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Assignment visitAssignment(@NotNull EnkelParser.AssignmentContext ctx) {
        EnkelParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        String varName = ctx.name().getText();
        return new Assignment(varName, expression);
    }
}
