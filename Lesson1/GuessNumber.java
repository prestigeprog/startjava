import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {	
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pcNumber = 7;
        System.out.println("I wanna play a game with you...");
        int playerNumber = Integer.parseInt(reader.readLine());

        while (true) {
            System.out.println("Guess the number!!!");
            if (pcNumber == yourNumber) {
                break;
            } else if (yourNumber > pcNumber) {
                System.out.println("Your number is greater than mine!");
            } else {
                System.out.println("Your number is less than mine!");
            }
        }
        System.out.println("NICE!!! You are right!");
    }
}