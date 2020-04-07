package com.startjava.lesson4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int attempt;
    private int secretNumber;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launchGame() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        attempt = 0;
        secretNumber = (int) (Math.random() * 101);
        for (attempt = 0; attempt < player1.getAttemptCount(); attempt++) {
            System.out.println("Загадывай число " + player1.getName() + " !!!");
            int p1Num = Integer.parseInt(reader.readLine());
            if (compareNumbers(player1, p1Num) == true) {
                break;
            }
            System.out.println("Загадывай число " + player2.getName() + " !!!");
            int p2Num = Integer.parseInt(reader.readLine());
            if (compareNumbers(player2, p2Num) == true) {
                break;
            }
        }
        printNumbers();
        clearAttempts();
    }

    public boolean compareNumbers(Player player, int pNum) {
        if (pNum > secretNumber) {
            System.out.println("Игрок " + player.getName() + " загадал число большее чем моё!!!");
            return false;
        } else if (pNum < secretNumber){
            System.out.println("Игрок " + player.getName() + " загадал число меньшее чем моё!!!");
            return false;
        } else if (pNum != secretNumber) {
            player.setNumber(attempt, pNum);
            return false;
        } else {
            player.setNumber(attempt, pNum);
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + attempt + " попытки");
            return true;
        }
    }

    public void printNumbers() {
        if (attempt >= 10) {
            System.out.println("Игроки исчерпали лимит попыток!");
            System.out.println("Попытки игрока " + player1.getName() + ":");
            int[] tmp = player1.getNumbers();
            for (int i = 0; i < player1.getAttemptCount(); i++) {
                System.out.print(tmp[i] + " ");
            }
            System.out.println("");
            System.out.println("Попытки игрока " + player2.getName() + ":");
            tmp = player2.getNumbers();
            for (int i = 0; i < player1.getAttemptCount(); i++) {
                System.out.print(tmp[i] + " ");
            }
            System.out.println("");
        }
    }

    public void clearAttempts() {
        Arrays.fill(player1.getNumbers(), 10);
        Arrays.fill(player2.getNumbers(), 10);
    }
}