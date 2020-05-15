package com.cbnits.exercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum()  {
        Calculator calculator = new Calculator();
        int expectedResult = 3;
        int actualResult = calculator.sum(1, 2);
        assertEquals(expectedResult, actualResult);
    }
}
