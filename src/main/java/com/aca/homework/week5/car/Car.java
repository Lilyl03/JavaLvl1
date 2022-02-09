package com.aca.homework.week5.car;

import java.util.Scanner;

public class Car {
    private String color;
    private String brand;
    private long width;
    private long weight;

    public Car(String color, String brand, long width, long weight) {
        this.color = color;
        this.brand = brand;
        this.weight = weight;
        this.width = width;
    }

    public Car() {

    }

    public Car[] createCar() {
        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            String brand = getBrand();
            if (brand.equalsIgnoreCase("bmw")) {
                Car car = new Bmw(getColor(), "bmw", getWidth(), getWeight());
                cars[i] = car;
            } else if (brand.equalsIgnoreCase("hyundai")) {
                Car car = new Hyundai(getColor(), "hyundai", getWidth(), getWeight());
                cars[i] = car;
            } else {
                i--;
            }
        }
        return cars;
    }

    public String getBrand() {
        System.out.println("Enter the brand: ");
        return new Scanner(System.in).nextLine();
    }

    public String getColor() {
        System.out.println("Enter the color: ");
        return new Scanner(System.in).nextLine();
    }

    public long getWidth() {
        System.out.println("Enter the width: ");
        return new Scanner(System.in).nextInt();
    }

    public long getWeight() {
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
