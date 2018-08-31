package com.bendcap.enkel.compiler.parsing.visitor.expression;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.CompareSign;
import com.bendcap.enkel.compiler.domain.node.expression.ConditionalExpression;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.expression.Value;
import com.bendcap.enkel.compiler.domain.type.BultInType;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:19.
 */
public class ConditionalExpressionVisitor extends EnkelBaseVisitor<ConditionalExpression> {
    private final ExpressionVisitor expressionVisitor;
    public ConditionalExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public ConditionalExpression visitConditionalExpression(@NotNull EnkelParser.ConditionalExpressionContext ctx) {
        EnkelParser.ExpressionContext leftExpressionCtx = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpressionCtx = ctx.expression(1);
        Expression leftExpression = leftExpressionCtx.accept(expressionVisitor);
        Expression rightExpression = rightExpressionCtx != null ? rightExpressionCtx.accept(expressionVisitor) : new Value(BultInType.INT, "0");
        CompareSign cmpSign = ctx.cmp != null ? CompareSign.fromString(ctx.cmp.getText()) : CompareSign.NOT_EQUAL;
        return new ConditionalExpression(leftExpression, rightExpression, cmpSign);
    }
}
