package com.aca.homework.week2.cars;

public class CarsTest {
    public static void main(String[] args) {
        Car[] cars = new Car[41];
        printCars(carsAfter2010(addCars(cars)));
    }

    private static Car[] addCars(Car[] cars) {
        for (int i = 1980; i <= 2020; i++) {
            Car car = new Car();
            car.brand = "Porsche";
            car.year = i;
            cars[i - 1980] = car;
        }
        return cars;
    }

    private static void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].brand + " " + cars[i].year);
        }
    }

    private static Car[] carsAfter2010(Car[] cars) {
        int cnt = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year >= 2010) {
                cnt++;
            }
        }
        Car[] carsAfter2010 = new Car[cnt];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year >= 2010) {
                carsAfter2010[--cnt] = cars[i];
            }

        }
        return carsAfter2010;
    }

}
