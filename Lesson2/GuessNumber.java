import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {
    void gameLauncher() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pcNumber = (int) (Math.random()*100);
        Player player1 = new Player("Sergo");
        Player player2 = new Player("Nikita");
        System.out.println("I wanna play a game with you...");

        while (pcNumber != player1.getNumber() && pcNumber != player2.getNumber()) {
            System.out.println("Guess the number, player one!!!");
            player1.setNumber(Integer.parseInt(reader.readLine()));
            System.out.println("Guess the number, player two!!!");
            player2.setNumber(Integer.parseInt(reader.readLine()));
            if (player1.getNumber() > pcNumber) {
                System.out.println("Player's one number is greater than mine!");
            } else {
                System.out.println("Player's one number is less than mine!");
            } if (player2.getNumber() < pcNumber) {
                System.out.println("Player's two number is less than mine!");
            } else {
                System.out.println("Player's two number is greater than mine!");
            }
        }
        System.out.println("WOW!!! We got winner!");
        System.out.println(player1.getNumber() + " - is Player's one number!");
        System.out.println(player2.getNumber() + " - is Player's two number!");
        System.out.println(pcNumber + " - is guessed number!!! Congratulations to the winner!!!");
    }
}