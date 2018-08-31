package com.bendcap.enkel.compiler.parsing.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import com.bendcap.enkel.compiler.parsing.visitor.expression.function.ParameterExpressionListVisitor;
import com.bendcap.enkel.compiler.utils.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/31  12:17.
 */
public class FunctionSignatureVisitor extends EnkelBaseVisitor<FunctionSignature> {
    private final ExpressionVisitor expressionVisitor;
    public FunctionSignatureVisitor(Scope scope) {
        this.expressionVisitor = new ExpressionVisitor(scope);
    }
    @Override
    public FunctionSignature visitFunctionDeclaration(@NotNull EnkelParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.functionName().getText();
        Type returnType = TypeResolver.getFromTypeContext(ctx.type());
        EnkelParser.ParametersListContext parametersCtx = ctx.parametersList();
        if(parametersCtx != null) {
            List<Parameter> parameters = parametersCtx.accept(new ParameterExpressionListVisitor(expressionVisitor));
            return new FunctionSignature(functionName, parameters, returnType);
        }
        return new FunctionSignature(functionName, Collections.emptyList(), returnType);
    }
}
