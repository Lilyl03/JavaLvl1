package com.aca.homework.week2.cars;

public class CarsTest {
    public static void main(String[] args) {
        int[] years = new int[41];
        Car cars = new Car();
        cars.brand = "Porshe";
        int k = 0;
        for(int i = 1980;i<=2020; i++){
            years[k] = i;
            k++;
        }
        int[] carsAfter2010 = carsAfter2010(years);
        printCars(carsAfter2010, cars);
    }

    private static void printCars(int[] carsAfter2010, Car cars) {
        for(int i : carsAfter2010){
            System.out.println(cars.brand + " " + i);
        }
    }

    private static int[] carsAfter2010(int[] years) {
        int[] carsAfter2010 = new int[11];
        int k = 0;
        for(int i = 30; i<=40;i++){
            carsAfter2010[k] = years[i];
            k++;
        }
        return carsAfter2010;
    }

}
