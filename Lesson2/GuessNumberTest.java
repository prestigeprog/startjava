import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumberTest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GuessNumber game = new GuessNumber();
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.println("What is your name, player one?");
        player1.name = reader.readLine();
        System.out.println("What is your name, player two?");
        player2.name = reader.readLine();
        String answer;
        int pcNumber = (int) (Math.random()*101);
        do {
            System.out.println("Guess the numbers, players!!!");
            game.gameLauncher(player1.number = Integer.parseInt(reader.readLine()), player2.number = Integer.parseInt(reader.readLine()), pcNumber);
            do {
                System.out.println("Again...?[y/n]");
                answer = reader.readLine();
            } while (!answer.equals("y") && !answer.equals("n"));
        }while (!answer.equals("n"));
    }
}