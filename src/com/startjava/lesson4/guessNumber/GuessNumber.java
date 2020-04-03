package com.startjava.lesson4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessNumber {
    Player player1;
    Player player2;
    private int attemptsCount = 10;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1.setAttempts(attemptsCount);
        this.player2.setAttempts(attemptsCount);
    }

    public void launchGame() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int secretNumber = (int) (Math.random() * 101);
        int attempt;
        for(attempt = 0; attempt < attemptsCount; attempt++){
            System.out.println("Загадывай число " + player1.getName() + " !!!");
            int p1Num = Integer.parseInt(reader.readLine());
            if(p1Num != secretNumber)
                player1.add(attempt, p1Num);
            else{
                System.out.println("Угадал " + player1.getName() + " c " + attempt + " попытки!!!");
                break;
            }
            
            System.out.println("Загадывай число " + player2.getName() + " !!!");
            int p2Num = Integer.parseInt(reader.readLine());
            if(p2Num != secretNumber)
                player2.add(attempt, p2Num);
            else{
             System.out.println("Угадал " + player1.getName() + " c " + attempt + " попытки!!!");
                break;   
            }
        }
        if (attempt >= 10) {
            System.out.println("Игроки исчерпали лимит попыток!");
            System.out.println("Попытки игрока " + player1.getName() + ":");
            int[] tmp = player1.getNumbers();
            for(int i = 0; i < attemptsCount; i++){
                System.out.print(tmp[i] + " ");
            }
            System.out.println("Попытки игрока " + player2.getName() + ":");
            tmp = player2.getNumbers();
            for(int i = 0; i < attemptsCount; i++){
                System.out.print(tmp[i] + " ");
            }
        }
    }
}
