package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.CompareSign;
import com.bendcap.enkel.compiler.domain.expression.*;
import com.bendcap.enkel.compiler.domain.math.Addition;
import com.bendcap.enkel.compiler.domain.math.Division;
import com.bendcap.enkel.compiler.domain.math.Multiplication;
import com.bendcap.enkel.compiler.domain.math.Substraction;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.utils.TypeResolver;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KevinOfNeu on 2018/8/22  16:04.
 */
public class ExpressionVisitor extends EnkelBaseVisitor<Expression> {
    private Scope scope;

    public ExpressionVisitor(Scope scope) {
        this.scope = scope;
    }


    @Override
    public Expression visitVarReference(EnkelParser.VarReferenceContext ctx) {
        String varName = ctx.getText();
        LocalVariable localVariable = scope.getLocalVariable(varName);
        return new VarReference(varName, localVariable.getType());
    }


    @Override
    public Expression visitValue(EnkelParser.ValueContext ctx) {
        String value = ctx.getText();
        Type type = TypeResolver.getFromValue(value);
        return new Value(type, value);
    }


    @Override
    public Expression visitFunctionCall(EnkelParser.FunctionCallContext ctx) {
        String funName = ctx.functionName().getText();
        FunctionSignature signature = scope.getSignature(funName);
        List<FunctionParameter> signatureParameters = signature.getArguments();
        List<EnkelParser.ExpressionContext> calledParameters = ctx.expressionList().expression();
        List<Expression> arguments = calledParameters.stream()
                .map((expressionContext -> expressionContext.accept(this)))
                .collect(Collectors.toList());
        Type returnType = signature.getReturnType();
        return new FunctionCall(signature, arguments, null);

    }

    @Override
    public Expression visitADD(EnkelParser.ADDContext ctx) {
        EnkelParser.ExpressionContext leftExpressionContext = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpressionContext = ctx.expression(1);
        Expression leftExpression = leftExpressionContext.accept(this);
        Expression rightExpression = rightExpressionContext.accept(this);

        return new Addition(leftExpression, rightExpression);
    }


    @Override
    public Expression visitMULTIPLY(EnkelParser.MULTIPLYContext ctx) {
        EnkelParser.ExpressionContext leftExpressionContext = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpressionContext = ctx.expression(1);
        Expression leftExpression = leftExpressionContext.accept(this);
        Expression rightExpression = rightExpressionContext.accept(this);

        return new Multiplication(leftExpression, rightExpression);
    }


    @Override
    public Expression visitSUBSTRACT(EnkelParser.SUBSTRACTContext ctx) {
        EnkelParser.ExpressionContext leftExpressionContext = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpressionContext = ctx.expression(1);
        Expression leftExpression = leftExpressionContext.accept(this);
        Expression rightExpression = rightExpressionContext.accept(this);

        return new Substraction(leftExpression, rightExpression);
    }

    @Override
    public Expression visitDIVIDE(EnkelParser.DIVIDEContext ctx) {
        EnkelParser.ExpressionContext leftExpressionContext = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpressionContext = ctx.expression(1);
        Expression leftExpression = leftExpressionContext.accept(this);
        Expression rightExpression = rightExpressionContext.accept(this);

        return new Division(leftExpression, rightExpression);
    }

    @Override
    public Expression visitConditionalExpression(EnkelParser.ConditionalExpressionContext ctx) {
        EnkelParser.ExpressionContext leftExpressionContext = ctx.expression(0);
        EnkelParser.ExpressionContext rightExpressionContext = ctx.expression(1);

        Expression leftExpression = leftExpressionContext.accept(this);
        Expression rightExpression = rightExpressionContext != null ? rightExpressionContext.accept(this) : new Value(BuiltInType.INT, "0");

        CompareSign cmpSign = ctx.cmp != null ? CompareSign.fromString(ctx.cmp.getText()) : CompareSign.NOT_EQUAL;
        return new ConditionalExpression(leftExpression, rightExpression, cmpSign);
    }
}

