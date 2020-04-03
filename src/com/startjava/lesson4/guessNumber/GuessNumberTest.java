package com.startjava.lesson4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessNumberTest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Первый игрок, добро пожаловать! Назови свое имя!");
        Player player1 = new Player(reader.readLine(), new int[10]);
        System.out.println("Второй игрок, добро пожаловать! Назови свое имя!");
        Player player2 = new Player(reader.readLine(), new int[10]);
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            System.out.println("У вас 10 попыток, игроки!");
            game.launchGame();
            do {
                System.out.println("Again...?[y/n]");
                answer = reader.readLine();
            } while (!answer.equals("y") && !answer.equals("n"));
        } while (!answer.equals("n"));
    }
}
//сообщение 10 попыток вначале
//в конце 2 строки со всеми числами игроков
//