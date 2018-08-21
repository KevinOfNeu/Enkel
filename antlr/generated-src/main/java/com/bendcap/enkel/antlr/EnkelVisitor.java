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
	 * Visit a parse tree produced by {@link EnkelParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull EnkelParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull EnkelParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull EnkelParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull EnkelParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull EnkelParser.ClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull EnkelParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#superClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperClassName(@NotNull EnkelParser.SuperClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull EnkelParser.ClassDeclarationContext ctx);
}