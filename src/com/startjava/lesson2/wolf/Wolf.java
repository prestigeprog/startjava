package com.startjava.lesson2.wolf;

public class Wolf {   
    private char sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSex (char sex) {
        this.sex = sex;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public void setAge (int age) {
        this.age = age;
        if (age > 8) {
            System.out.println("Incorrect age!");
        }
    }


    public void setColor (String color) {
        this.color = color;
    }

    public void sit() {
    }

    public void run() {
    }

    public void howl() {
    }

    public void go() {
    }

    public void hunt() {
    }
}

