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
	 * Enter a parse tree produced by {@link EnkelParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull EnkelParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull EnkelParser.PrintContext ctx);

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
	 * Enter a parse tree produced by {@link EnkelParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull EnkelParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull EnkelParser.VariableContext ctx);

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
}