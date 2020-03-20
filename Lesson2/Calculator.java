public class Calculator {   
    private int firstNum;

    public int getFirstNum () {
        return firstNum;
    }

    public void setFirstNum (int firstNum) {
        this.firstNum = firstNum;
    }

    private String action;

    public String getAction () {
        return action;
    }

    public void setAction (String action) {
        this.action = action;
    }

    private int secondNum;

    public int getSecondNum () {
        return secondNum;
    }

    public void setSecondNum (int secondNum) {
        this.secondNum = secondNum;
    }



    public void calculate(int firstNum,String action,int secondNum) {
        switch(action) {
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
                int score = 1;
                for (int i = 0; i < secondNum; i++) {
                    score *= firstNum;
                }
                System.out.println(score);
        }
    }
}