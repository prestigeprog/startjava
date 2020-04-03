package com.startjava.lesson4.guessNumber;

public class Player {
    private String name;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
    }

    void add(int attempt, int number) {
        numbers[attempt] = number;
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
    
    public void setAttempts(int attemptsCount){
        numbers = new int[attemptsCount];
    }
    
    public int[] getNumbers(){
        return numbers;
    }
    
}
