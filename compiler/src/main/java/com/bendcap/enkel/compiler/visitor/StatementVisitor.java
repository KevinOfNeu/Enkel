package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.expression.EmptyExpression;
import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.*;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by KevinOfNeu on 2018/8/21  09:48.
 */
public class StatementVisitor extends EnkelBaseVisitor<Statement> {
    private Scope scope;
    private ExpressionVisitor expressionVisitor;

    public StatementVisitor(Scope scope) {
        this.scope = scope;
        expressionVisitor = new ExpressionVisitor(scope);
    }

    @Override
    public Statement visitPrintStatement(EnkelParser.PrintStatementContext ctx) {
        EnkelParser.ExpressionContext expressionContext = ctx.expression();
        Expression expression = expressionContext.accept(expressionVisitor);
        return new PrintStatement(expression);
    }


    @Override
    public Statement visitVariableDeclaration(EnkelParser.VariableDeclarationContext ctx) {
        String varName = ctx.name().getText();
        EnkelParser.ExpressionContext expressionCtx = ctx.expression();
        Expression expression = expressionCtx.accept(expressionVisitor);
        scope.addLocalVariable(new LocalVariable(varName, expression.getType()));
        return new VariableDeclarationStatement(varName, expression);
    }

    @Override
    public Statement visitFunctionCall(EnkelParser.FunctionCallContext ctx) {
        return (Statement) ctx.accept(new ExpressionVisitor(scope));
    }

    @Override
    public Statement visitRETURNVOID(EnkelParser.RETURNVOIDContext ctx) {
        return new ReturnStatement(new EmptyExpression(BuiltInType.VOID));
    }

    @Override
    public Statement visitRETURNWITHVALUE(EnkelParser.RETURNWITHVALUEContext ctx) {
        Expression expression = ctx.expression().accept(expressionVisitor);
        return new ReturnStatement(expression);
    }

    @Override
    public Statement visitBlock(EnkelParser.BlockContext ctx) {
        List<EnkelParser.StatementContext> blockStatementCtx = ctx.statement();
        Scope newScope = new Scope(scope);
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        List<Statement> statements = blockStatementCtx.stream()
                .map(stmt -> stmt.accept(statementVisitor))
                .collect(Collectors.toList());
        return new Block(newScope, statements);
    }

    @Override
    public Statement visitIfStatement(EnkelParser.IfStatementContext ctx) {
        EnkelParser.ExpressionContext conditionExpressionContext = ctx.expression();
        Expression condition = conditionExpressionContext.accept(expressionVisitor);
        Statement trueStatement = ctx.trueStatement.accept(this);
        Statement falseStatement = ctx.falseStatement.accept(this);
        return new IfStatement(condition, trueStatement, falseStatement);
    }


    @Override
    public Statement visitForStatement(EnkelParser.ForStatementContext ctx) {
        ForStatementVisitor forStatementVisitor = new ForStatementVisitor(scope);
        return ctx.accept(forStatementVisitor);
    }
}
