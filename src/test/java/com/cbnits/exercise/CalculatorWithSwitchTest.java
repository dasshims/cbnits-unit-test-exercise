package com.cbnits.exercise;

import org.junit.*;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalculatorWithSwitchTest {

    public static CalculatorWithSwitch calculatorWithSwitch;

    //@BeforeClass runs once before the entire test fixture
    @BeforeClass
    public static void initializeCalculator() {
        //Mostly used when for opening connections to database or initializing a class
        calculatorWithSwitch = new CalculatorWithSwitch();
    }

    //@Before is executed before each @Test
    @Before
    public void before() {
        System.out.println("Running before each @Test start");
    }

    @Test
    public void testCalcualtorGood() {
        int expectedResult = 3;
        int actualResult = (int) calculatorWithSwitch.calculate(1, 2, '+');
        Assert.assertEquals(actualResult, actualResult);
    }

    //Testing to see if we get IOException
    @Test(expected = IOException.class)
    public void writeToFile() throws IOException {
        calculatorWithSwitch.writeToFile(99, "some/bad/path");
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }


}
