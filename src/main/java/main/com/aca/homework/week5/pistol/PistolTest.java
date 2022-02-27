package com.aca.homework.week5.pistol;

import java.util.Scanner;

public class PistolTest {
    public static void main(String[] args) {
        print(createGun());

    }
    public static Pistol[] createGun(){
        Pistol[] gunStores= new Pistol[4];
        for (int i = 0; i < gunStores.length; i++) {
            System.out.println("Enter the Gun type");
            String name = new Scanner(System.in).nextLine();
            if(name.equals("air pistol")){
                Pistol pistol = new AirPistol();
                gunStores[i] = pistol;
            }
            else if(name.equals("makarov")){
                Pistol pistol = new MakarovPistol();
                gunStores[i] = pistol;
            }
            else if(name.equals("nagant")){
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
