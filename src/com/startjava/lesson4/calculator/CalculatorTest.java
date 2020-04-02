package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите математическое выражение: ");
            Calculator calculator = new Calculator();

            calculator.calculate(scanner.nextLine());
            do {
                System.out.println("Again...?[y/n]");
                answer = scanner.nextLine();
            } while (!answer.equals("y") && !answer.equals("n"));
        }while (!answer.equals("n"));
    }
}