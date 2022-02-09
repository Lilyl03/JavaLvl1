package com.aca.homework.week5.pistol;

import java.util.Scanner;

public class GunStore {
    private String name;
    public GunStore(){}


    public static String getName() {
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
      GunStore gunStore = new GunStore();
      print(createGun());

    }
    public static GunStore[] createGun(){
        GunStore[] gunStores= new GunStore[4];
        for (int i = 0; i < gunStores.length; i++) {
            String name = getName();
            if(name.equals("air pistol")){
                GunStore pistol = new AirPistol();
                gunStores[i] = pistol;
            }
            if(name.equals("makarov")){
                GunStore pistol = new MakarovPistol();
                gunStores[i] = pistol;
            }
            if(name.equals("nagant")){
                GunStore pistol = new NagantPistol();
                gunStores[i] = pistol;
            }else{
                i--;
            }

        }
    return gunStores;
    }
    public static void print(GunStore[] gunStores){
        for(int i = 0 ; i < gunStores.length; i++){
            System.out.println(gunStores[i]);
        }
    }
}
