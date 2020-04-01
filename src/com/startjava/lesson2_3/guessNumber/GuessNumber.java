package com.startjava.lesson2_3.guessNumber;

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
        do {
            System.out.println("Guess the number, player one!!!");
            player1.setNumber(Integer.parseInt(reader.readLine()));
            System.out.println("Guess the number, player two!!!");
            player2.setNumber(Integer.parseInt(reader.readLine()));
        
            if (player1.getNumber() == secretNumber) {
                System.out.println("Player's one number is correct!");
                break;
            } else if (player1.getNumber() < secretNumber) {
                System.out.println("Player's one number is less than mine!");
            } else {
                System.out.println("Player's one number is greater than mine!");
            }

            if (player2.getNumber() == secretNumber) {
                System.out.println("Player's two number is correct!");
                break;
            } else if (player2.getNumber() < secretNumber) {
                System.out.println("Player's two number is less than mine!");
            } else {
                System.out.println("Player's two number is greater than mine!");
            }
        } while(true);
    }
}