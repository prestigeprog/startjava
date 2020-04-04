package com.startjava.lesson4.guessNumber;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    void add(int attemptCount, int number) {
        numbers[attemptCount] = number;
    }

    public String getName() {
        return name;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int[] getNumbers() {
        return numbers;
    }
}