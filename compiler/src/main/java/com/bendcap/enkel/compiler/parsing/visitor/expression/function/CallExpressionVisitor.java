package com.bendcap.enkel.compiler.parsing.visitor.expression.function;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.*;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.exception.FunctionNameEqualClassException;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/31  12:22.
 */
public class CallExpressionVisitor extends EnkelBaseVisitor<Call> {
    private final ExpressionVisitor expressionVisitor;
    private final Scope scope;

    public CallExpressionVisitor(ExpressionVisitor expressionVisitor, Scope scope) {
        this.expressionVisitor = expressionVisitor;
        this.scope = scope;
    }

    @Override
    public Call visitFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx) {
        String functionName = ctx.functionName().getText();
        if (functionName.equals(scope.getClassName())) {
            throw new FunctionNameEqualClassException(functionName);
        }
        List<Argument> arguments = getArgumentsForCall(ctx.argumentList());
        FunctionSignature signature = scope.getMethodCallSignature(functionName, arguments);
        boolean ownerIsExplicit = ctx.owner != null;
        if (ownerIsExplicit) {
            Expression owner = ctx.owner.accept(expressionVisitor);
            return new FunctionCall(signature, arguments, owner);
        }
        ClassType thisType = new ClassType(scope.getClassName());
        return new FunctionCall(signature, arguments, new VariableReference("this", thisType));
    }

    @Override
    public Call visitConstructorCall(@NotNull EnkelParser.ConstructorCallContext ctx) {
        String className = ctx.className().getText();
        List<Argument> arguments = getArgumentsForCall(ctx.argumentList());
        return new ConstructorCall(className, arguments);
    }

    @Override
    public Call visitSupercall(@NotNull EnkelParser.SupercallContext ctx) {
        List<Argument> arguments = getArgumentsForCall(ctx.argumentList());
        return new SuperCall(arguments);
    }

    private List<Argument> getArgumentsForCall(EnkelParser.ArgumentListContext argumentsListCtx) {
        if (argumentsListCtx != null) {
            ArgumentExpressionsListVisitor visitor = new ArgumentExpressionsListVisitor(expressionVisitor);
            return argumentsListCtx.accept(visitor);
        }
        return Collections.emptyList();
    }
}
