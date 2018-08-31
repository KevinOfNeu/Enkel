package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.VariableDeclaration;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:26.
 */
public class VariableDeclarationStatementVisitor  extends EnkelBaseVisitor<VariableDeclaration> {
    private final ExpressionVisitor expressionVisitor;
    private final Scope scope;
    public VariableDeclarationStatementVisitor(ExpressionVisitor expressionVisitor, Scope scope) {
        this.expressionVisitor = expressionVisitor;
        this.scope = scope;
    }
    @Override
    public VariableDeclaration visitVariableDeclaration(@NotNull EnkelParser.VariableDeclarationContext ctx) {
        String varName = ctx.name().getText();
        EnkelParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        scope.addLocalVariable(new LocalVariable(varName, expression.getType()));
        return new VariableDeclaration(varName, expression);
    }
}

