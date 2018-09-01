// Generated from com/bendcap/enkel/antlr/Enkel.g4 by ANTLR 4.3

package com.bendcap.enkel.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnkelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnkelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedArgumentsList(@NotNull EnkelParser.UnnamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull EnkelParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(@NotNull EnkelParser.ReturnVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull EnkelParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(@NotNull EnkelParser.VariableReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(@NotNull EnkelParser.ForConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull EnkelParser.ClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull EnkelParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull EnkelParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(@NotNull EnkelParser.DivideContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(@NotNull EnkelParser.VarReferenceContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(@NotNull EnkelParser.ReturnWithValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull EnkelParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull EnkelParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(@NotNull EnkelParser.MultiplyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull EnkelParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupercall(@NotNull EnkelParser.SupercallContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull EnkelParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull EnkelParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(@NotNull EnkelParser.ConstructorCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull EnkelParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentsList(@NotNull EnkelParser.NamedArgumentsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(@NotNull EnkelParser.NamedArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull EnkelParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(@NotNull EnkelParser.ValueExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull EnkelParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull EnkelParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull EnkelParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull EnkelParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull EnkelParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull EnkelParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull EnkelParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Substract}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstract(@NotNull EnkelParser.SubstractContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull EnkelParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull EnkelParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull EnkelParser.FieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithDefaultValue(@NotNull EnkelParser.ParameterWithDefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull EnkelParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(@NotNull EnkelParser.ParametersListContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull EnkelParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull EnkelParser.ClassTypeContext ctx);
}