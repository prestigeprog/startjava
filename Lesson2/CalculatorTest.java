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

            calculator.doScore(calculator.getFirstNum(), calculator.getAction(), calculator.getSecondNum());
            String answer;

            while(true) {
                System.out.println("Again...?[y/n]");
                String answer1 = reader.readLine();
                if (answer1.equals("y")) {
                    answer = answer1;
                    break;
                } else if (answer1.equals("n")) {
                    answer = answer1;
                    break; 
                }
            }
            
            if (answer.equals("y")) {
                System.out.println("Continue!");
            } else if (answer.equals("n")) {
                    break; 
            }
        }
    }
}