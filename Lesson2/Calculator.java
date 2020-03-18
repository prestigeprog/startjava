public class Calculator {   
    private int firstNum;
    private String action;
    private int secondNum;

    public int getFirstNum () {
        return firstNum;
    }

    public int getSecondNum () {
        return secondNum;
    }

    public String getAction () {
        return action;
    }

    public void setFirstNum (int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum (int secondNum) {
        this.secondNum = secondNum;
    }

    public void setAction (String action) {
        this.action = action;
    }

    public void doScore(int firstNum,String action,int secondNum) {

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
                break;
        }
    }
}