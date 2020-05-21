package com.cbnits.exercise;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public Calculator calculator;

    @BeforeClass
    public static void initializeCalculator(){
        Calculator calculator = new Calculator();
    }

    @Before
    public static void before(){
        System.out.println("Before test initialize resources");
    }

    @After
    public static void after(){
        System.out.println("After tests destroy resources");
    }
    @Test
    public void testSum()  {
        int expectedResult = 3;
        int actualResult = calculator.sum(1, 2);
        assertEquals(expectedResult, actualResult);
    }
}
