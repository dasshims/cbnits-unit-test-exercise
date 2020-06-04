package com.cbnits.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CalculatorWithSwitchBad {

    public static void calculate(double first, double second, char operator) throws IOException {
        double result;

        //Does calculation
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
                return;
        }

        //Writes result to file..
        String thignToWriteToFile = "Result of calculaiton -- " + result;
        Files.write(Paths.get("src/resources/output.txt"), thignToWriteToFile.getBytes());
    }
}
