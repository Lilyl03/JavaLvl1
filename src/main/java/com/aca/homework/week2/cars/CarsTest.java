package com.aca.homework.week2.cars;

public class CarsTest {
    public static void main(String[] args) {
        Car[] car = new Car[41];
        Car cars = new Car();
        cars.brand = "Porshe";
        int k = 0;
        for(int i = 1980;i<=2020; i++){
            Car cars1 = new Car();
            cars1.year = i;
            car[k] = cars1;
            k++;
        }
        Car[] carsAfter2010 = carsAfter2010(car);
        printCars(carsAfter2010, cars);
    }

    private static void printCars(Car[] car, Car cars) {
        for(int i = 0; i < car.length;i++){
            System.out.println(cars.brand + " " + car[i].year);
        }
    }

    private static Car[] carsAfter2010(Car[] car) {
        Car[] c = new Car[11];
        int k = 0;
        for(int i = 30; i<=40;i++){
            Car car1 = new Car();
            car1.year = car[i].year;
            c[k] = car1;
            k++;
        }
        return c;
    }

}
