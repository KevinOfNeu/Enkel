package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.ConditionalExpression;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:25.
 */
public class StatementVisitor extends EnkelBaseVisitor<Statement> {
    private final ExpressionVisitor expressionVisitor;
    private final PrintStatementVisitor printStatementVisitor;
    private final VariableDeclarationStatementVisitor variableDeclarationStatementVisitor;
    private final ReturnStatementVisitor returnStatementVisitor;
    private final BlockStatementVisitor blockStatementVisitor;
    private final IfStatementVisitor ifStatementVisitor;
    private final ForStatementVisitor forStatementVisitor;
    private final AssignmentStatementVisitor assignmentStatementVisitor;

    public StatementVisitor(Scope scope) {
        expressionVisitor = new ExpressionVisitor(scope);
        printStatementVisitor = new PrintStatementVisitor(expressionVisitor);
        variableDeclarationStatementVisitor = new VariableDeclarationStatementVisitor(expressionVisitor, scope);
        returnStatementVisitor = new ReturnStatementVisitor(expressionVisitor);
        blockStatementVisitor = new BlockStatementVisitor(scope);
        ifStatementVisitor = new IfStatementVisitor(this, expressionVisitor);
        forStatementVisitor = new ForStatementVisitor(scope);
        assignmentStatementVisitor = new AssignmentStatementVisitor(expressionVisitor);
    }

    @Override
    public Statement visitPrintStatement(@NotNull EnkelParser.PrintStatementContext ctx) {
        return printStatementVisitor.visitPrintStatement(ctx);
    }

    @Override
    public Statement visitVariableDeclaration(@NotNull EnkelParser.VariableDeclarationContext ctx) {
        return variableDeclarationStatementVisitor.visitVariableDeclaration(ctx);
    }

    @Override
    public Statement visitReturnVoid(@NotNull EnkelParser.ReturnVoidContext ctx) {
        return returnStatementVisitor.visitReturnVoid(ctx);
    }

    @Override
    public Statement visitReturnWithValue(@NotNull EnkelParser.ReturnWithValueContext ctx) {
        return returnStatementVisitor.visitReturnWithValue(ctx);
    }

    @Override
    public Statement visitBlock(@NotNull EnkelParser.BlockContext ctx) {
        return blockStatementVisitor.visitBlock(ctx);
    }

    @Override
    public Statement visitIfStatement(@NotNull EnkelParser.IfStatementContext ctx) {
        return ifStatementVisitor.visitIfStatement(ctx);
    }

    @Override
    public Expression visitVarReference(@NotNull EnkelParser.VarReferenceContext ctx) {
        return expressionVisitor.visitVarReference(ctx);
    }

    @Override
    public Expression visitValue(@NotNull EnkelParser.ValueContext ctx) {
        return expressionVisitor.visitValue(ctx);
    }

    @Override
    public Expression visitFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx) {
        return expressionVisitor.visitFunctionCall(ctx);
    }

    @Override
    public Expression visitConstructorCall(@NotNull EnkelParser.ConstructorCallContext ctx) {
        return expressionVisitor.visitConstructorCall(ctx);
    }

    @Override
    public Expression visitSupercall(@NotNull EnkelParser.SupercallContext ctx) {
        return expressionVisitor.visitSupercall(ctx);
    }

    @Override
    public Expression visitAdd(@NotNull EnkelParser.AddContext ctx) {
        return expressionVisitor.visitAdd(ctx);
    }

    @Override
    public Expression visitMultiply(@NotNull EnkelParser.MultiplyContext ctx) {
        return expressionVisitor.visitMultiply(ctx);
    }

    @Override
    public Expression visitSubstract(@NotNull EnkelParser.SubstractContext ctx) {
        return expressionVisitor.visitSubstract(ctx);
    }

    @Override
    public Expression visitDivide(@NotNull EnkelParser.DivideContext ctx) {
        return expressionVisitor.visitDivide(ctx);
    }

    @Override
    public ConditionalExpression visitConditionalExpression(@NotNull EnkelParser.ConditionalExpressionContext ctx) {
        return expressionVisitor.visitConditionalExpression(ctx);
    }

    @Override
    public Statement visitForStatement(@NotNull EnkelParser.ForStatementContext ctx) {
        return forStatementVisitor.visitForStatement(ctx);
    }

    @Override
    public Statement visitAssignment(EnkelParser.AssignmentContext ctx) {
        return assignmentStatementVisitor.visitAssignment(ctx);
    }
}
