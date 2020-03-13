import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {   
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Furst num");
        int firstNum = Integer.parseInt(reader.readLine());
        System.out.println("Enter Second num");
        int secondNum = Integer.parseInt(reader.readLine());
        System.out.println("What we need to do?");
        String action = reader.readLine();

        if (action.contains("+")) {
            System.out.println(firstNum + secondNum);
        } else if (action.contains("-")) {
            System.out.println(firstNum - secondNum);
        } else if (action.contains("*")) {
            System.out.println(firstNum * secondNum);
        } else if (action.contains("/")) {
            System.out.println(firstNum / secondNum);
        } else if (action.contains("%")) {
            System.out.println(firstNum % secondNum);
        } else if (action.contains("^")) {
            int score = 1;
            for (int i = 0; i < secondNum; i++) {
                score *= firstNum;
                }
            System.out.println(score);
        }
    }
}

