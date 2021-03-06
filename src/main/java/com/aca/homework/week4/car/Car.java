package com.aca.homework.week4.car;

import java.util.Scanner;

public class Car {
    private final String color;
    private final String brand;
    private final long width;
    private final long weight;

    public Car(String color, String brand, long width, long weight) {
        this.color = color;
        this.brand = brand;
        this.weight = weight;
        this.width = width;
    }


    public static String getBrand() {
        System.out.println("Enter the brand: ");
        return new Scanner(System.in).nextLine();
    }

    public static String getColor() {
        System.out.println("Enter the color: ");
        return new Scanner(System.in).nextLine();
    }

    public static long getWidth() {
        System.out.println("Enter the width: ");
        return new Scanner(System.in).nextInt();
    }

    public static long getWeight() {
        System.out.println("Enter the weight: ");
        return new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return ")" +
                "brand =" + brand +
                ",color = " + color +
                ", width=" + width +
                ", weight=" + weight;
    }
}
