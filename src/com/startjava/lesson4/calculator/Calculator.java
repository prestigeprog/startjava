package com.startjava.lesson4.calculator;

public class Calculator {
    private String mathOperation;

    public Calculator(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public String getMathOperation() {
        return mathOperation;
    }
    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

     String[] arrSplit = mathOperation.split("");



    private int firstNum = Integer.parseInt(arrSplit[0]);
    private int secondNum = Integer.parseInt(arrSplit[2]);

    public void calculate() {
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
