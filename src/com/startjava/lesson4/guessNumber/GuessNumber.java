package com.startjava.lesson4.guessNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GuessNumber {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Player player1;
    private Player player2;
    private int attempt;
    private int secretNumber;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launchGame() throws Exception {
        attempt = 0;
        secretNumber = (int) (Math.random() * 101);
        for (attempt = 0; attempt < player1.getAttemptCount(); attempt++) {
            if (addAndCompareNumbers(player1) == true) {
                break;
            }
            if (addAndCompareNumbers(player2) == true) {
                break;
            }
        }
        printNumbers(player1);
        printNumbers(player2);
        clearAttempts(player1, attempt);
        clearAttempts(player2, attempt);
    }

    public boolean addAndCompareNumbers(Player player) throws IOException {
        System.out.println("Загадывай число " + player.getName() + " !!!");
        int pNum = Integer.parseInt(reader.readLine());
        player.setNumber(attempt, pNum);
        if (pNum == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + attempt + " попытки");
            return true;
        } else if (pNum > secretNumber) {
            System.out.println("Игрок " + player.getName() + " загадал число большее чем моё!!!");
        } else {
            System.out.println("Игрок " + player.getName() + " загадал число меньшее чем моё!!!");
        }
        return false;
    }

    public void printNumbers(Player player) {
        System.out.println("Попытки игрока " + player.getName() + ":");
        int[] finalNumbers = player.getNumbers();
        for (int num : finalNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public void clearAttempts(Player player, int attempt) {
        Arrays.fill(player.getNumbers(), attempt);
    }
}