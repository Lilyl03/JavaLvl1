package com.aca.homework.week2.symbolcount;


import java.util.Scanner;

public class SymbolCount {
    public static void main(String[] args) {
        System.out.println("Please write a text:");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Please write a symbol");
        String s1 = new Scanner(System.in).next();
        int cnt = 0;
        for(int i = 1; i< s.length();i++){
            if(s.substring(i-1,i).equals(s1)){
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
