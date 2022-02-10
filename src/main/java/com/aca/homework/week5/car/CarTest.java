package com.aca.homework.week5.car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        print(createCar(car));

    }
    public static  Car[] createCar(Car car) {
        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            String brand = car.getBrand();
            if (brand.equalsIgnoreCase("bmw")) {
                car = new Bmw(car.getColor(), "bmw", car.getWidth(), car.getWeight());
                cars[i] = car;
            } else if (brand.equalsIgnoreCase("hyundai")) {
                car = new Hyundai(car.getColor(), "hyundai", car.getWidth(), car.getWeight());
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
