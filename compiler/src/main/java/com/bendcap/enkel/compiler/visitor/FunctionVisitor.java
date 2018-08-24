package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.clazz.Function;
import com.bendcap.enkel.compiler.domain.expression.FunctionParameter;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.Statement;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.utils.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KevinOfNeu on 2018/8/22  16:03.
 */
public class FunctionVisitor extends EnkelBaseVisitor<Function> {
    private Scope scope;

    public FunctionVisitor(Scope scope) {
        this.scope = new Scope(scope);
    }

    @Override
    public Function visitFunction(@NotNull EnkelParser.FunctionContext ctx) {
        String name = getName(ctx);
        Type returnType = getReturnType(ctx);
        List<FunctionParameter> arguments = getArguments(ctx);
        Statement block = getBlock(ctx);
        return new Function(name, returnType, arguments, block);
    }

    private Statement getBlock(EnkelParser.FunctionContext functionContext) {
        StatementVisitor statementVisitor = new StatementVisitor(scope);
        EnkelParser.BlockContext blockContext = functionContext.block();
        return blockContext.accept(statementVisitor);
    }

    private String getName(EnkelParser.FunctionContext functionDeclarationContext) {
        return functionDeclarationContext.functionDeclaration().functionName().getText();
    }

    private Type getReturnType(EnkelParser.FunctionContext functionDeclarationContext) {
        EnkelParser.TypeContext typeCtx = functionDeclarationContext.functionDeclaration().type();
        return TypeResolver.getFromTypeName(typeCtx);
    }

    private List<FunctionParameter> getArguments(EnkelParser.FunctionContext functionDeclarationContext) {
        List<EnkelParser.FunctionArgumentContext> argsCtx = functionDeclarationContext.functionDeclaration().functionArgument();
        List<FunctionParameter> parameters = argsCtx.stream()
                .map(paramCtx -> new FunctionParameter(paramCtx.ID().getText(), TypeResolver.getFromTypeName(paramCtx.type())))
                .peek(param -> scope.addLocalVariable(new LocalVariable(param.getName(), param.getType())))
                .collect(Collectors.toList());
        return parameters;
    }

}
