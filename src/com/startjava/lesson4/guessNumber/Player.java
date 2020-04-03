package com.startjava.lesson4.guessNumber;

public class Player {
    private String name;
    private int attempts;
    private int[] numbers;

    void add(int attemptCount, int number) {
        numbers[attemptCount] = number;
    }

    int getBack(int attemptCount) {
        return numbers[attemptCount];
    }


    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttempts() {
        return attempts;
    }
}