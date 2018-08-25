package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.expression.FunctionParameter;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.utils.TypeResolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/22  16:03.
 */
public class FunctionSignatureVisitor extends EnkelBaseVisitor<FunctionSignature> {

   private Scope scope;
   private ExpressionVisitor expressionVisitor;

    public FunctionSignatureVisitor(Scope scope) {
        this.scope = scope;
        this.expressionVisitor = new ExpressionVisitor(scope);
    }

    @Override
    public FunctionSignature visitFunctionDeclaration(EnkelParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.functionName().getText();
        List<EnkelParser.FunctionParameterContext> argsCtx = ctx.functionParameter();
        List<FunctionParameter> parameters = new ArrayList<>();
        for (int i = 0; i < argsCtx.size(); i++) {
            EnkelParser.FunctionParameterContext argCtx = argsCtx.get(i);
            String name = argCtx.ID().getText();
            Type type = TypeResolver.getFromTypeName(argCtx.type());
            Optional<Expression> defaultValue = getParameterDefaultValue(argCtx);
            FunctionParameter functionParameter = new FunctionParameter(name, type, defaultValue);
            parameters.add(functionParameter);
        }
        Type returnType = TypeResolver.getFromTypeName(ctx.type());
        return new FunctionSignature(functionName, parameters, returnType);
    }

    private Optional<Expression> getParameterDefaultValue(EnkelParser.FunctionParameterContext parameterContext) {
        if (parameterContext.functionParamdefaultValue() != null) {
            EnkelParser.ExpressionContext defaultValueCtx = parameterContext.functionParamdefaultValue().expression();
            return Optional.of(defaultValueCtx.accept(expressionVisitor));
        }
        return Optional.empty();
    }
}
