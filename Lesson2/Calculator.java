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
}