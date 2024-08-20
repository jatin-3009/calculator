package com.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScientificCalculatorTest {
    private ScientificCalculator scientificCalculator;

    @BeforeEach
    void setup() {
        scientificCalculator = new ScientificCalculator();
    }

    @Test
    @DisplayName("Test Sin of given Double")
    void testSinOperation() {
        double expectedResult = 1.0;
        scientificCalculator.sin(Math.PI / 2);
        double actualResult = scientificCalculator.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Cos of given Double")
    void testCosOperation() {
        double expectedResult = -1.0;
        scientificCalculator.cos(Math.PI);
        double actualResult = scientificCalculator.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Tan of given Double")
    void testTanOperation() {
        double expectedResult = 0;
        scientificCalculator.tan(0);
        double actualResult = scientificCalculator.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Log of given Double")
    void testLogOperation() {
        double expectedResult = 1;
        scientificCalculator.log(Math.exp(1));
        double actualResult = scientificCalculator.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Square Root of given Double")
    void testSquareRootOperation() {
        double expectedResult = 2;
        scientificCalculator.sqrt(4);
        double actualResult = scientificCalculator.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Cube Root of given Double")
    void testCubeRootOperation() {
        double expectedResult = 2;
        scientificCalculator.cbrt(8);
        double actualResult = scientificCalculator.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Square of given Double")
    void testSquareOperation() {
        double expectedResult = 16;
        scientificCalculator.square(4);
        double actualResult = scientificCalculator.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Square Overflow")
    void testSquareOverflow() {
        assertThrows(ArithmeticException.class, () -> scientificCalculator.square(Double.MAX_VALUE));
    }
}