package com.aca.homework.week5.car;

public class CarTest {
    public static void main(String[] args) {
        Car car  = new Car();
        print(car.createCar());

    }
    public static void print(Car[] cars){
        for(int i = 0; i < cars.length; i++){
                System.out.println(i+1  + cars[i].toString());
        }
    }
}
