package com.startjava.lesson4.calculator;

public class Calculator {
    private String mathOperation = "1 x 2";

    public String getMathOperation() {
        return mathOperation;
    }
    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    private String[] arrOfMathOperation = mathOperation.split(" ", 3);

    private int firstNum = Integer.parseInt(arrOfMathOperation[0]);
    private int secondNum = Integer.parseInt(arrOfMathOperation[2]);

    public void calculate() {
        switch(arrOfMathOperation[1]) {
            case "+" :
                System.out.println(firstNum + secondNum);
                break;
            case "-" :
                System.out.println(firstNum - secondNum);
                break;
            case "*" :
                System.out.println(firstNum * secondNum);
                break;
            case "/" :
                System.out.println(firstNum / secondNum);
                break;
             case "%" :
                System.out.println(firstNum % secondNum);
                break;
            case "^" :
                System.out.println(Math.pow(firstNum, secondNum));
        }
    }
}
