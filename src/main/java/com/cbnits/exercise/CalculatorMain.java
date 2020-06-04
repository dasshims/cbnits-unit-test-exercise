package com.cbnits.exercise;

import java.io.IOException;

public class CalculatorMain {
    public static void main(String[] args) {
        double first = 1;
        double second = 2;
        char operator = 3;

        //Calling the bad calculator
        try {
            CalculatorWithSwitchBad.calculate(first, second, operator);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Calling good calculator
        try {
            double result = CalculatorWithSwitch.calculate(first, second, operator);
            CalculatorWithSwitch.writeToFile(result, "src/resources/output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

