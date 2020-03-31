package com.startjava.lesson2.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorTest {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        do {
            Calculator calculator = new Calculator();
            System.out.println("Enter Furst num");
            calculator.setFirstNum(Integer.parseInt(reader.readLine()));
            System.out.println("What we need to do?");
            calculator.setAction(reader.readLine());
            System.out.println("Enter Second num");
            calculator.setSecondNum(Integer.parseInt(reader.readLine()));

            calculator.calculate();
            do {
                System.out.println("Again...?[y/n]");
                answer = reader.readLine();
            } while (!answer.equals("y") && !answer.equals("n"));
        }while (!answer.equals("n"));
    }
}