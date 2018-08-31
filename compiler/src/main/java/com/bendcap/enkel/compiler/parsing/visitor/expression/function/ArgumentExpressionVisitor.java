package com.bendcap.enkel.compiler.parsing.visitor.expression.function;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Argument;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/31  12:21.
 */
public class ArgumentExpressionVisitor extends EnkelBaseVisitor<Argument> {
    private final ExpressionVisitor expressionVisitor;
    public ArgumentExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public Argument visitArgument(@NotNull EnkelParser.ArgumentContext ctx) {
        Expression value = ctx.expression().accept(expressionVisitor);
        return new Argument(value, Optional.empty());
    }
    @Override
    public Argument visitNamedArgument(@NotNull EnkelParser.NamedArgumentContext ctx) {
        Expression value = ctx.expression().accept(expressionVisitor);
        String name = ctx.name().getText();
        return new Argument(value, Optional.of(name));
    }
}
