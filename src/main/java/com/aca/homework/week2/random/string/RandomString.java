package com.aca.homework.week2.random.string;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String[] randomChar = {"a","b","w","7","8","9","u"};
        for(int i = 0; i<10;i++){
            System.out.println(randomString(randomChar));
        }
    }
    public static String randomString(String[] string){
        String s = "";
        for(int i = 0; i < 5;i++){
            int randomInt =  new Random().nextInt(6);
            s += string[randomInt];
        }
        return s;
    }
}
