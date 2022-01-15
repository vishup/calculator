package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTests {

    static Stream<Arguments> provideDataFor_ValidExpressions() {
        return Stream.of(
                Arguments.of(
                        "calculator_givenValidAddExpression_returnsTrue",
                        "1+2+4",
                        7),
                Arguments.of(
                        "calculator_givenValidAddExpression_WithBrackets_returnsTrue",
                        "1+(2+3)",
                        6),
                Arguments.of(
                        "calculator_givenValidSubtractExpression_returnsTrue",
                        "6-3+2",
                        1),
                Arguments.of(
                        "calculator_givenValidSubtractExpression_WithBrackets_returnsTrue",
                        "4-(2+2)",
                        0),
                Arguments.of(
                        "calculator_givenValidMultiplyExpression_returnsTrue",
                        "1+2*4",
                        9),
                Arguments.of(
                        "calculator_givenValidMultiplyExpression_WithBrackets_returnsTrue",
                        "(3*2)+4",
                        10),
                Arguments.of(
                        "calculator_givenValidMultiplyExpression_WithBrackets2_returnsTrue",
                        "3*(2+4)",
                        18),
                Arguments.of(
                        "calculator_givenValidDivideExpression_returnsTrue",
                        "6/3",
                        2),
                Arguments.of(
                        "calculator_givenValidDivideExpression_WithBrackets_returnsTrue",
                        "(5+4)/3",
                        3)
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideDataFor_ValidExpressions")
    void testCalculator_GivenValidExpressions_ReturnsTrue(String testName, String expression, int result) {
        double calculatedResult = Calculator.calculate(expression);

        assertEquals(result, calculatedResult, "Calculated result is correct.");
    }

    static Stream<Arguments> provide_DataFor_InvalidExpressions() {
        return Stream.of(
                Arguments.of(
                        "calculator_givenInValidDivideExpression_throwsIllegalArgumentException",
                        "6/0")
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provide_DataFor_InvalidExpressions")
    void testCalculator_GivenInvalidExpression_ThrowsException(String testName, String expression) {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(expression));
    }
}
