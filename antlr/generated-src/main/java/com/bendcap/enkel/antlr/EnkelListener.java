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
	 * Enter a parse tree produced by {@link EnkelParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull EnkelParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull EnkelParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull EnkelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull EnkelParser.ExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link EnkelParser#superClassName}.
	 * @param ctx the parse tree
	 */
	void enterSuperClassName(@NotNull EnkelParser.SuperClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#superClassName}.
	 * @param ctx the parse tree
	 */
	void exitSuperClassName(@NotNull EnkelParser.SuperClassNameContext ctx);

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
	 * Enter a parse tree produced by {@link EnkelParser#varReference}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(@NotNull EnkelParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#varReference}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(@NotNull EnkelParser.VarReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnkelParser#functionParamdefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParamdefaultValue(@NotNull EnkelParser.FunctionParamdefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#functionParamdefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParamdefaultValue(@NotNull EnkelParser.FunctionParamdefaultValueContext ctx);

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
	 * Enter a parse tree produced by {@link EnkelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull EnkelParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull EnkelParser.ExpressionListContext ctx);

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
	 * Enter a parse tree produced by {@link EnkelParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgument(@NotNull EnkelParser.FunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgument(@NotNull EnkelParser.FunctionArgumentContext ctx);

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
	 * Enter a parse tree produced by {@link EnkelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx);

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