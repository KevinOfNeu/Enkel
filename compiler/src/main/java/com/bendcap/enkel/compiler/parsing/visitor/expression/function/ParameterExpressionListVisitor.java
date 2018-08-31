package com.bendcap.enkel.compiler.parsing.visitor.expression.function;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/31  12:22.
 */
public class ParameterExpressionListVisitor extends EnkelBaseVisitor<List<Parameter>> {
    private final ExpressionVisitor expressionVisitor;
    public ParameterExpressionListVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public List<Parameter> visitParametersList(@NotNull EnkelParser.ParametersListContext ctx) {
        List<EnkelParser.ParameterContext> paramsCtx = ctx.parameter();
        ParameterExpressionVisitor parameterExpressionVisitor = new ParameterExpressionVisitor(expressionVisitor);
        List<Parameter> parameters = new ArrayList<>();
        if(paramsCtx != null) {
            List<Parameter> params = Lists.transform(paramsCtx, p -> p.accept(parameterExpressionVisitor));
            parameters.addAll(params);
        }
        List<EnkelParser.ParameterWithDefaultValueContext> paramsWithDefaultValueCtx = ctx.parameterWithDefaultValue();
        if(paramsWithDefaultValueCtx != null) {
            List<Parameter> params = Lists.transform(paramsWithDefaultValueCtx, p -> p.accept(parameterExpressionVisitor));
            parameters.addAll(params);
        }
        return parameters;
    }
}
