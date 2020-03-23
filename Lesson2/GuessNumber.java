import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {
    public int gameLauncher(int number1, int number2, int pcNumber) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            if (number1 > pcNumber) {
                System.out.println("Player's one number is greater than mine!");
            } else {
                System.out.println("Player's one number is less than mine!");
            }
            if (number2 < pcNumber) {
                System.out.println("Player's two number is less than mine!");
            } else {
                System.out.println("Player's two number is greater than mine!");
            }
            if (number1 == pcNumber && number2 == pcNumber) {
            System.out.println("WOW!!! We got winner!");
            System.out.println(number1 + " - is Player's one number!");
            System.out.println(number2 + " - is Player's two number!");
            System.out.println(pcNumber + " - is guessed number!!! Congratulations to the winner!!!");
        }
        return number1; 
    }
}