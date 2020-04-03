package com.startjava.lesson4.guessNumber;

public class Player {
    private String name;
    private int[] numbers;

    public Player(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    void add(int attemptCount, int number) {
        numbers[attemptCount] = number;
    }

    int getBack(int attemptCount) {
        return numbers[attemptCount];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return numbers;
    }
}