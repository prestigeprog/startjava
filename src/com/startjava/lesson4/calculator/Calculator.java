package com.startjava.lesson4.calculator;

public class Calculator {
    private String mathOperation;

    public Calculator(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        String[] arrSplit = mathOperation.split(" ", 3);
        int firstNum = Integer.parseInt(arrSplit[0]);
        int secondNum = Integer.parseInt(arrSplit[2]);
        switch(arrSplit[1]) {
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
