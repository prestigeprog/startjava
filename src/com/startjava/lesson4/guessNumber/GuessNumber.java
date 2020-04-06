package com.startjava.lesson4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int attempt = 0;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launchGame() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int secretNumber = (int) (Math.random() * 101);
        for (attempt = 0; attempt < player1.getAttemptCount(); attempt++) {
            System.out.println("Загадывай число " + player1.getName() + " !!!");
            int p1Num = Integer.parseInt(reader.readLine());
            if (p1Num != secretNumber) {
                player1.setNumbers(attempt, p1Num);
            } else {
                player1.setNumbers(attempt, p1Num);
                System.out.println("Игрок " + player1.getName() + " угадал число " + secretNumber + " с " + attempt + " попытки");
                break;
            }
            System.out.println("Загадывай число " + player2.getName() + " !!!");
            int p2Num = Integer.parseInt(reader.readLine());
            if (p2Num != secretNumber) {
                player2.setNumbers(attempt, p2Num);
            } else {
                player2.setNumbers(attempt, p2Num);
                System.out.println("Игрок " + player2.getName() + " угадал число " + secretNumber + " с " + attempt + " попытки");
                break;
            }
        }
        checkAttempts();
        clearAttempts();
    }

    public void checkAttempts() {
        if (attempt >= 10) {
            System.out.println("Игроки исчерпали лимит попыток!");
            System.out.println("Попытки игрока " + player1.getName() + ":");
            int[] tmp = player1.copy();
            for (int i = 0; i < player1.getAttemptCount(); i++) {
                System.out.print(tmp[i] + " ");
            }
            System.out.println("");
            System.out.println("Попытки игрока " + player2.getName() + ":");
            tmp = player2.copy();
            for (int i = 0; i < player1.getAttemptCount(); i++) {
                System.out.print(tmp[i] + " ");
            }
            System.out.println("");
        }
    }

    public void clearAttempts() {
        for (int i = 0; i < attempt; i++) {
            Arrays.fill(player1.getNumbers(), i);
            Arrays.fill(player2.getNumbers(), i);
        }
    }
}