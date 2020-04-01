package com.startjava.lesson2_3.wolf;

public class WolfTest {
    public static void main(String[] args) throws Exception {
        Wolf wolf = new Wolf();
        wolf.setSex('m');
        wolf.setName("jacob");
        wolf.setWeight(120);
        wolf.setAge(23);
        wolf.setColor("black");

        System.out.println(wolf.getSex());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.go();
        wolf.hunt();
    }
}