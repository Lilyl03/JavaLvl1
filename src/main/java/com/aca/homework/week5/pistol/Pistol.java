package com.aca.homework.week5.pistol;

import java.util.Scanner;

public class Pistol {
    private String name;
    public static String getName() {
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
      Pistol pistol = new Pistol();
      print(createGun());

    }
    public static Pistol[] createGun(){
        Pistol[] gunStores= new Pistol[4];
        for (int i = 0; i < gunStores.length; i++) {
            String name = getName();
            if(name.equals("air pistol")){
                Pistol pistol = new AirPistol();
                gunStores[i] = pistol;
            }
            if(name.equals("makarov")){
                Pistol pistol = new MakarovPistol();
                gunStores[i] = pistol;
            }
            if(name.equals("nagant")){
                Pistol pistol = new NagantPistol();
                gunStores[i] = pistol;
            }else{
                i--;
            }

        }
    return gunStores;
    }
    public static void print(Pistol[] gunStores){
        for(int i = 0 ; i < gunStores.length; i++){
            System.out.println(gunStores[i]);
        }
    }
}
