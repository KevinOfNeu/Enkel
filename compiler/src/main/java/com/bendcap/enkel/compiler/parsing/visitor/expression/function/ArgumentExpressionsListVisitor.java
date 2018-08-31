package com.bendcap.enkel.compiler.parsing.visitor.expression.function;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Argument;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by KevinOfNeu on 2018/8/31  12:21.
 */
public class ArgumentExpressionsListVisitor extends EnkelBaseVisitor<List<Argument>> {
    private final ExpressionVisitor expressionVisitor;
    public ArgumentExpressionsListVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public List<Argument> visitUnnamedArgumentsList(@NotNull EnkelParser.UnnamedArgumentsListContext ctx) {
        ArgumentExpressionVisitor argumentExpressionVisitor = new ArgumentExpressionVisitor(expressionVisitor);
        return ctx.argument().stream()
                .map(a -> a.accept(argumentExpressionVisitor)).collect(toList());
    }
    @Override
    public List<Argument> visitNamedArgumentsList(@NotNull EnkelParser.NamedArgumentsListContext ctx) {
        ArgumentExpressionVisitor argumentExpressionVisitor = new ArgumentExpressionVisitor(expressionVisitor);
        return ctx.namedArgument().stream()
                .map(a -> a.accept(argumentExpressionVisitor)).collect(toList());
    }
}
