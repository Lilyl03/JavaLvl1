package com.aca.homework.week5.car;

public class CarTest {
    public static void main(String[] args) {
        print(createCar());

    }
    public static  Car[] createCar() {
        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            String brand = Car.getBrand();
            if (brand.equalsIgnoreCase("bmw")) {
                Car car = new Bmw(Car.getColor(), Car.getWidth(), Car.getWeight());
                cars[i] = car;
            } else if (brand.equalsIgnoreCase("hyundai")) {
                Car car = new Hyundai(Car.getColor(), Car.getWidth(), Car.getWeight());
                cars[i] = car;
            } else {
                i--;
            }
        }
        return cars;
    }

    public static void print(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + "" + cars[i]);
        }
    }
}
