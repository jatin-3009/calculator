package com.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup() {
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation() {
        standardCalculator.add(1, 1);
        double actualResult = standardCalculator.getResult();
        assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Subtraction of Two Integers")
    void testSubtractionOperation() {
        standardCalculator.subtract(1, 1);
        double actualResult = standardCalculator.getResult();
        assertEquals(0, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation() {
        standardCalculator.multiply(1, 1);
        double actualResult = standardCalculator.getResult();
        assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation() {
        standardCalculator.divide(1, 1);
        double actualResult = standardCalculator.getResult();
        assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles() {
        standardCalculator.add(1.0, 1.5);
        double actualResult = standardCalculator.getResult();
        assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Subtraction of Two Doubles")
    void testSubtractionOperationForDoubles() {
        standardCalculator.subtract(10.0, 20.5);
        double actualResult = standardCalculator.getResult();
        assertEquals(-10.5, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Doubles")
    void testMultiplicationOperationForDoubles() {
        standardCalculator.multiply(2.5, 4.0);
        double actualResult = standardCalculator.getResult();
        assertEquals(10.0, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Doubles")
    void testDivisionOperationForDoubles() {
        standardCalculator.divide(10.0, 4.0);
        double actualResult = standardCalculator.getResult();
        assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles() {
        assertThrows(ArithmeticException.class, () -> standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles() {
        assertThrows(ArithmeticException.class, () -> standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles() {
        assertThrows(ArithmeticException.class, () -> standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles in which One is Positive and Other is Negative")
    void testMultiplicationOverflowForDoublesOnePosOtherNeg() {
        assertThrows(ArithmeticException.class, () -> standardCalculator.multiply(-Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    @DisplayName("Test Division Divide By Zero Scenario")
    void testDivisionDivideByZero() {
        assertThrows(ArithmeticException.class, () -> standardCalculator.divide(10.0, 0.0));
    }
}
