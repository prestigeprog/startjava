package com.startjava.lesson4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessNumber {
    Player player1;
    Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launchGame() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int secretNumber = (int) (Math.random() * 101);
        int attemptsCount = 0;
        do {
            System.out.println("Загадывай число " + player1.getName() + " !!!");
            player1.add(attemptsCount, Integer.parseInt(reader.readLine()));
            System.out.println("Загадывай число " + player2.getName() + " !!!");
            player2.add(attemptsCount, Integer.parseInt(reader.readLine()));
            if (player1.getBack(attemptsCount) == secretNumber) {
                System.out.println("Угадал " + player1.getName() + " c " + attemptsCount + " попытки!!!");
                break;
            }

            if (player2.getBack(attemptsCount) == secretNumber) {
                System.out.println("Угадал " + player2.getName() + " c " + attemptsCount + " попытки!!!");
                break;
            }
            attemptsCount++;
        } while (attemptsCount < 10);
        if (attemptsCount >= 10) {
            System.out.println("Игроки исчерпали лимит попыток!");
        }
    }
}