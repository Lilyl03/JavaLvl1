package com.aca.homework.week4.gun;

public class Gun {

    private int cartridgeCnt;

    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.load();
        gun.load();
        gun.fire();
        gun.fire();
    }
    public void load() {
        if (cartridgeCnt < 10) {
            cartridgeCnt++;
            System.out.println("The carriage is loaded");

        } else {
            System.out.println("The carriage is full");
        }
    }

    public void fire() {

        if(cartridgeCnt > 0){
            cartridgeCnt--;
            System.out.println("fire!");
        }else {
            System.out.println("Out of cartridge");
        }
    }
}
