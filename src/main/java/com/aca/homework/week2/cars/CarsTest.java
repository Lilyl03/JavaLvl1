package com.aca.homework.week2.cars;

public class CarsTest {
    public static void main(String[] args) {
        Car[] car = new Car[41];
        for(int i = 1980;i<=2020; i++){
            Car cars = new Car();
            cars.brand = "Porshe";
            cars.year = i;
            car[i-1980] = cars;
        }
        Car[] carsAfter2010 = carsAfter2010(car);
        printCars(carsAfter2010);
    }

    private static void printCars(Car[] car ) {
        for(int i = 0; i < car.length;i++){
            System.out.println(car[i].brand + " " + car[i].year);
        }
    }

    private static Car[] carsAfter2010(Car[] car) {
        int k =0;
        for(int i = 0; i<car.length;i++){
            if(car[i].year>=2010){
                k++;
            }
        }
        Car[] c = new Car[k];
        for(int i =car.length-k; i< car.length;i++){
            Car car1 = new Car();
            car1.brand = car[i].brand;
            car1.year = car[i].year;
            c[car.length-i-1] = car1;
        }
        return c;
    }

}
