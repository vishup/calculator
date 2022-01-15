package com.calculator;

import com.calculator.model.CalculatorBaseVisitor;
import com.calculator.model.CalculatorLexer;
import com.calculator.model.CalculatorParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calculator extends CalculatorBaseVisitor<Double> {

    public static double calculate(String expression) {
        CalculatorParser parser = createParser(expression);
        ParseTree tree = parser.expression();
        return new Calculator().visit(tree);
    }

    static CalculatorParser createParser(String expression) {
        CharStream stream = CharStreams.fromString(expression);
        CalculatorLexer lexer = new CalculatorLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        return new CalculatorParser(tokenStream);
    }

    @Override
    public Double visitInteger(CalculatorParser.IntegerContext ctx) {
        return Double.valueOf(ctx.INTEGER().getText());
    }

    @Override
    public Double visitParenthesis(CalculatorParser.ParenthesisContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitAdd(CalculatorParser.AddContext ctx) {
        return visit(ctx.left) + visit(ctx.right);
    }

    @Override
    public Double visitSubtract(CalculatorParser.SubtractContext ctx) {
        return visit(ctx.left) - visit(ctx.right);
    }

    @Override
    public Double visitDivide(CalculatorParser.DivideContext ctx) {
        double divisor = visit(ctx.right);
        if (divisor == 0) throw new IllegalArgumentException("Divisor cannot be 0");
        return visit(ctx.left) / divisor;
    }

    @Override
    public Double visitMultiply(CalculatorParser.MultiplyContext ctx) {
        return visit(ctx.left) * visit(ctx.right);
    }
}
