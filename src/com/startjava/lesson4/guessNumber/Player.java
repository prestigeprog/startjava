package com.startjava.lesson4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attemptCount;

    public Player(String name) {
        this.name = name;
    }

    void setNumbers(int attemptCount, int number) {
        numbers[attemptCount] = number;
    }

    public String getName() {
        return name;
    }

    public void setAttempts(int attempts) {
        this.attemptCount = attempts;
    }

    public int[] getNumbers() {
        return numbers;
    }
    int[] copy() {
        int[] copyNumbers = Arrays.copyOf(numbers, 10);
        return copyNumbers;
    }
}