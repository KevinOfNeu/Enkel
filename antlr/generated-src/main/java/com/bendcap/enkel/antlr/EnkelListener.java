// Generated from com/bendcap/enkel/antlr/Enkel.g4 by ANTLR 4.3

package com.bendcap.enkel.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnkelParser}.
 */
public interface EnkelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedArgumentsList(@NotNull EnkelParser.UnnamedArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedArgumentsList(@NotNull EnkelParser.UnnamedArgumentsListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull EnkelParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull EnkelParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(@NotNull EnkelParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(@NotNull EnkelParser.ReturnVoidContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull EnkelParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull EnkelParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(@NotNull EnkelParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(@NotNull EnkelParser.VariableReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void enterForConditions(@NotNull EnkelParser.ForConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void exitForConditions(@NotNull EnkelParser.ForConditionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull EnkelParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull EnkelParser.ClassNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull EnkelParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull EnkelParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull EnkelParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull EnkelParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull EnkelParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull EnkelParser.DivideContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(@NotNull EnkelParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(@NotNull EnkelParser.VarReferenceContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithValue(@NotNull EnkelParser.ReturnWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link EnkelParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithValue(@NotNull EnkelParser.ReturnWithValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull EnkelParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull EnkelParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull EnkelParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull EnkelParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull EnkelParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull EnkelParser.MultiplyContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull EnkelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull EnkelParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSupercall(@NotNull EnkelParser.SupercallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Supercall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSupercall(@NotNull EnkelParser.SupercallContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull EnkelParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull EnkelParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull EnkelParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull EnkelParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(@NotNull EnkelParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorCall}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(@NotNull EnkelParser.ConstructorCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull EnkelParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull EnkelParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgumentsList(@NotNull EnkelParser.NamedArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgumentsList}
	 * labeled alternative in {@link EnkelParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgumentsList(@NotNull EnkelParser.NamedArgumentsListContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(@NotNull EnkelParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(@NotNull EnkelParser.NamedArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull EnkelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull EnkelParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(@NotNull EnkelParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(@NotNull EnkelParser.ValueExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull EnkelParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull EnkelParser.FunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull EnkelParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull EnkelParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull EnkelParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull EnkelParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull EnkelParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull EnkelParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull EnkelParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull EnkelParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull EnkelParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull EnkelParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull EnkelParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull EnkelParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Substract}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstract(@NotNull EnkelParser.SubstractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Substract}
	 * labeled alternative in {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstract(@NotNull EnkelParser.SubstractContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull EnkelParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull EnkelParser.PrintStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull EnkelParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull EnkelParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull EnkelParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull EnkelParser.FieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithDefaultValue(@NotNull EnkelParser.ParameterWithDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#parameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithDefaultValue(@NotNull EnkelParser.ParameterWithDefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull EnkelParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull EnkelParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(@NotNull EnkelParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(@NotNull EnkelParser.ParametersListContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull EnkelParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull EnkelParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull EnkelParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull EnkelParser.ClassTypeContext ctx);
}