package com.bendcap.enkel.compiler.parsing.visitor.expression;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.*;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:19.
 */
public class ArithmeticExpressionVisitor extends EnkelBaseVisitor<ArthimeticExpression> {
    private final ExpressionVisitor expressionVisitor;
    public ArithmeticExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public ArthimeticExpression visitAdd(@NotNull EnkelParser.AddContext ctx) {
        EnkelParser.ExpressionContext leftExpression = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpression = ctx.expression(1);
        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);
        return new Addition(leftExpress, rightExpress);
    }
    @Override
    public ArthimeticExpression visitMultiply(@NotNull EnkelParser.MultiplyContext ctx) {
        EnkelParser.ExpressionContext leftExpression = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpression = ctx.expression(1);
        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);
        return new Multiplication(leftExpress, rightExpress);
    }
    @Override
    public ArthimeticExpression visitSubstract(@NotNull EnkelParser.SubstractContext ctx) {
        EnkelParser.ExpressionContext leftExpression = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpression = ctx.expression(1);
        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);
        return new Substraction(leftExpress, rightExpress);
    }
    @Override
    public ArthimeticExpression visitDivide(@NotNull EnkelParser.DivideContext ctx) {
        EnkelParser.ExpressionContext leftExpression = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpression = ctx.expression(1);
        Expression leftExpress = leftExpression.accept(expressionVisitor);
        Expression rightExpress = rightExpression.accept(expressionVisitor);
        return new Division(leftExpress, rightExpress);
    }
}
