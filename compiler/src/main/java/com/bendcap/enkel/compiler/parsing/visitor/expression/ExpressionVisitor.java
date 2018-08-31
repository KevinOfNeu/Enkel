package com.bendcap.enkel.compiler.parsing.visitor.expression;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.ConditionalExpression;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.parsing.visitor.expression.function.CallExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:20.
 */
public class ExpressionVisitor extends EnkelBaseVisitor<Expression> {
    private final ArithmeticExpressionVisitor arithmeticExpressionVisitor;
    private final VariableReferenceExpressionVisitor variableReferenceExpressionVisitor;
    private final ValueExpressionVisitor valueExpressionVisitor;
    private final CallExpressionVisitor callExpressionVisitor;
    private final ConditionalExpressionVisitor conditionalExpressionVisitor;
    public ExpressionVisitor(Scope scope) {
        arithmeticExpressionVisitor = new ArithmeticExpressionVisitor(this);
        variableReferenceExpressionVisitor = new VariableReferenceExpressionVisitor(scope);
        valueExpressionVisitor = new ValueExpressionVisitor();
        callExpressionVisitor = new CallExpressionVisitor(this, scope);
        conditionalExpressionVisitor = new ConditionalExpressionVisitor(this);
    }
    @Override
    public Expression visitVarReference(@NotNull EnkelParser.VarReferenceContext ctx) {
        return variableReferenceExpressionVisitor.visitVarReference(ctx);
    }
    @Override
    public Expression visitValue(@NotNull EnkelParser.ValueContext ctx) {
        return valueExpressionVisitor.visitValue(ctx);
    }
    @Override
    public Expression visitFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx) {
        return callExpressionVisitor.visitFunctionCall(ctx);
    }
    @Override
    public Expression visitConstructorCall(@NotNull EnkelParser.ConstructorCallContext ctx) {
        return callExpressionVisitor.visitConstructorCall(ctx);
    }
    @Override
    public Expression visitSupercall(@NotNull EnkelParser.SupercallContext ctx) {
        return callExpressionVisitor.visitSupercall(ctx);
    }
    @Override
    public Expression visitAdd(@NotNull EnkelParser.AddContext ctx) {
        return arithmeticExpressionVisitor.visitAdd(ctx);
    }
    @Override
    public Expression visitMultiply(@NotNull EnkelParser.MultiplyContext ctx) {
        return arithmeticExpressionVisitor.visitMultiply(ctx);
    }
    @Override
    public Expression visitSubstract(@NotNull EnkelParser.SubstractContext ctx) {
        return arithmeticExpressionVisitor.visitSubstract(ctx);
    }
    @Override
    public Expression visitDivide(@NotNull EnkelParser.DivideContext ctx) {
        return arithmeticExpressionVisitor.visitDivide(ctx);
    }
    @Override
    public ConditionalExpression visitConditionalExpression(@NotNull EnkelParser.ConditionalExpressionContext ctx) {
        return conditionalExpressionVisitor.visitConditionalExpression(ctx);
    }
}
