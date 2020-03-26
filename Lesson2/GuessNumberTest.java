import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumberTest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name, player one?");
        Player player1 = new Player(reader.readLine());
        System.out.println("What is your name, player two?");
        Player player2 = new Player(reader.readLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.gameLauncher();
            do {
                System.out.println("Again...?[y/n]");
                answer = reader.readLine();
            } while (!answer.equals("y") && !answer.equals("n"));
        }while (!answer.equals("n"));
    }
}