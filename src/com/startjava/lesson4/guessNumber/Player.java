package com.startjava.lesson4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attemptCount = 10;

    public Player(String name) {
        this.name = name;
    }

    void setNumber(int attemptCount, int number) {
        numbers[attemptCount] = number;
    }

    public String getName() {
        return name;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int[] getNumbers() {
        int[] copyNumbers = Arrays.copyOf(numbers, 10);
        return copyNumbers;
    }
}