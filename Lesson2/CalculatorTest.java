import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorTest {
    public static void main (String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Furst num");
        Calculator calculator = new Calculator();
        calculator.setFirstNum() = console.nextInt();
        System.out.println("What we need to do?");
        calculator.setAction() = console.nextLine();
        System.out.println("Enter Second num");
        calculator.setSecondNum() = console.nextInt();

        switch(calculator.getAction()) {
            case "+" :
                System.out.println(calculator.getFirstNum() + calculator.getSecondNum());
                break;
            case "-" :
                System.out.println(calculator.getFirstNum() - calculator.getSecondNum());
                break;
            case "*" :
                System.out.println(calculator.getFirstNum() * calculator.getSecondNum());
                break;
            case "/" :
                System.out.println(calculator.getFirstNum() / calculator.getSecondNum());
                break;
            case "%" :
                System.out.println(calculator.getFirstNum() % calculator.getSecondNum());
                break;
            case "^" :
                int score = 1;
                for (int i = 0; i < calculator.getSecondNum(); i++) {
                    score *= calculator.getFirstNum();
                }
                System.out.println(score);
                break;
        }
    }
}