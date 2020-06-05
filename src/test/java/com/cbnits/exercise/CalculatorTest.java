package com.cbnits.exercise;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public static Calculator calculator;

    //@BeforeClass runs once before the entire test fixture
    @BeforeClass
    public static void initializeCalculator() {
        //Mostly used when for opening connections to database or initializing a class
        calculator = new Calculator();
    }

    //@Before is executed before each @Test
    @Before
    public void before() {
        System.out.println("Running before each @Test start");
    }

    //Logic test
    @Test
    public void testSum() {
        int expectedResult = 3;
        int actualResult = calculator.sum(1, 2);
        assertEquals(expectedResult, actualResult);
    }


    //@After is executed after each @Test
    @After
    public void after() {
        System.out.println("Running @After after each @Test ends ");
    }

    //@AfterClass runs once after the entire test fixture
    @AfterClass
    public static void destroy() {
        // Mostly used for closing database connections after all test runs.
        //It will run even if there are test failures in between
        calculator = null;

    }
}
