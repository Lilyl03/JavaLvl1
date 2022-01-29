package com.aca.homework.week3.numbers.max.min;

public class NumbersTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(78,98,154);
        System.out.println("The max is:");
        System.out.println(numbers.max());
        System.out.println("The min is:");
        System.out.println(numbers.min());
    }
}
