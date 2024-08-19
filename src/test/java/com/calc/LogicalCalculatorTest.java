package com.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicalCalculatorTest {
    private LogicalCalculator logicalCalculator;
    @BeforeEach
    void setup(){
        logicalCalculator = new LogicalCalculator();
    }

    @Test
    @DisplayName("Test AND of two Integers")
    void testANDOperation(){
        double expectedResult = 5;

        logicalCalculator.AND(5,7);
        double actualResult = logicalCalculator.getResult();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    @DisplayName("Test OR of two Integers")
    void testOROperation(){
        double expectedResult = 7;

        logicalCalculator.OR(5,7);
        double actualResult = logicalCalculator.getResult();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    @DisplayName("Test XOR of two Integers")
    void testXOROperation(){
        double expectedResult = 2;

        logicalCalculator.XOR(5,7);
        double actualResult = logicalCalculator.getResult();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    @DisplayName("Test NOT of given Integer")
    void testNOTOperation(){
        double expectedResult = -6;

        logicalCalculator.NOT(5);
        double actualResult = logicalCalculator.getResult();

        assertEquals(expectedResult, actualResult);
    }
}
