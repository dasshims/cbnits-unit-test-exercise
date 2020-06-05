package com.cbnits.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CalculatorWithSwitch {

    public static double calculate(double first, double second, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.printf("Error! operator is not correct");
                return 0;
        }

        return result;
    }

    public static void writeToFile(double result, String path) throws IOException {
        String thingsTowriteToFile = "Result of calculation -- " + result;
        Files.write(Paths.get(path), thingsTowriteToFile.getBytes());
    }
}
