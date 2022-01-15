// Generated from Calculator.g4 by ANTLR 4.8
package com.calculator.model;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(CalculatorParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CalculatorParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(CalculatorParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(CalculatorParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(CalculatorParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(CalculatorParser.SubtractContext ctx);
}