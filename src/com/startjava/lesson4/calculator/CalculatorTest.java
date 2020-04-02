package com.startjava.lesson4.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatorTest {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        do {
            Calculator calculator = new Calculator();
            System.out.println("Введите математическое выражение: ");
            calculator.setMathOperation(reader.readLine());

            calculator.calculate();
            do {
                System.out.println("Again...?[y/n]");
                answer = reader.readLine();
            } while (!answer.equals("y") && !answer.equals("n"));
        }while (!answer.equals("n"));
    }
}