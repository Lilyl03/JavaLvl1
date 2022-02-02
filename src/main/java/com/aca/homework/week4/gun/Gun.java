package com.aca.homework.week4.gun;

public class Gun {

    private int[] cartridge = new int[10];
    private int t;

    public int[] load() {
        if (cartridge.length > t) {
            if (cartridge[t] != 1) {
                cartridge[t] = 1;
                t++;
                System.out.println("The carriage is loaded");
            }
        } else {
            System.out.println("The carriage is full");
        }
        return cartridge;
    }

    public int[] fire() {

        if(t > 0){
            t--;
        if (cartridge[t] != 0) {
            cartridge[t] = 0;

            System.out.println("fire!");
        } }else {
            System.out.println("Out of cartridge");
        }
        return cartridge;
    }
}
