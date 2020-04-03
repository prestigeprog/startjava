package com.startjava.lesson4.calculator;

public class Calculator {
    private String mathOperation;

    public String calculate(String mathOperation) {
        this.mathOperation = mathOperation;
        String[] splitMathOperation = mathOperation.split(" ");
        int firstNum = Integer.parseInt(splitMathOperation[0]);
        int secondNum = Integer.parseInt(splitMathOperation[2]);
        switch (splitMathOperation[1]) {
            case "+":
                return Integer.toString(firstNum + secondNum);
            case "-":
                return Integer.toString(firstNum - secondNum);
            case "*":
                return Integer.toString(firstNum * secondNum);
            case "/":
                return Integer.toString(firstNum / secondNum);
            case "%":
                return Integer.toString(firstNum % secondNum);
            case "^":
                return Double.toString(Math.pow(firstNum, secondNum));
        }
        return " ";
    }
}
