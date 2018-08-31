package com.bendcap.enkel.compiler.parsing.visitor.expression.function;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import com.bendcap.enkel.compiler.utils.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/31  12:22.
 */
public class ParameterExpressionVisitor extends EnkelBaseVisitor<Parameter> {
    private final ExpressionVisitor expressionVisitor;
    public ParameterExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public Parameter visitParameter(@NotNull EnkelParser.ParameterContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeName(ctx.type());
        return new Parameter(name, type, Optional.empty());
    }
    @Override
    public Parameter visitParameterWithDefaultValue(@NotNull EnkelParser.ParameterWithDefaultValueContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getFromTypeName(ctx.type());
        Expression defaultValue = ctx.defaultValue.accept(expressionVisitor);
        return new Parameter(name, type, Optional.of(defaultValue));
    }
}
