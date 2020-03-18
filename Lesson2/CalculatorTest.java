import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorTest {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
                Calculator calculator = new Calculator();
                System.out.println("Enter Furst num");
                calculator.setFirstNum(Integer.parseInt(reader.readLine()));
                System.out.println("What we need to do?");
                calculator.setAction(reader.readLine());
                System.out.println("Enter Second num");
                calculator.setSecondNum(Integer.parseInt(reader.readLine()));
        
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

                System.out.println("Again...?[y/n]");
                String answer = reader.readLine();
                if (answer.equals("y")) {
                    System.out.println("Continue!");
                } else if (answer.equals("n")) {
                    break;
                }
        }
    }
}