package com.startjava.lesson4.guessNumber;

public class Player {
    private String name;
    private int[] numbers;
    private int attempts;

    public Player(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;
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