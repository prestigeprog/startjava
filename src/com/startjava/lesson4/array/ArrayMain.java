package com.startjava.lesson4.array;

public class ArrayMain {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, .5f, 200.5f};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] text = new String[3];
        for (String string : text) {
            System.out.println(string);
        }
    }
}
