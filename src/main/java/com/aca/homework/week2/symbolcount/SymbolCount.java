package com.aca.homework.week2.symbolcount;


import java.util.Scanner;

public class SymbolCount {
    public static void main(String[] args) {
        System.out.println("Please write a text:");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Please write a symbol");
        char s1 = new Scanner(System.in).next().charAt(0);
        int cnt = 0;
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i) == s1){
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
