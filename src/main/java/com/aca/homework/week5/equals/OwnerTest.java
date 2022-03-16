package com.aca.homework.week5.equals;

public class OwnerTest {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Mark", "Yorgantz");
        Owner owner2 = new Owner("Mark", "Tavares");

        Motorcycle motorcycle1 = new Motorcycle(owner1, MotorcycleType.YAMAHA);
        Motorcycle motorcycle2 = new Motorcycle(owner2, MotorcycleType.YAMAHA);
        System.out.println(motorcycle1.equals(motorcycle2));
    }
}
