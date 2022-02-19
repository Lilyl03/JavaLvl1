package com.aca.homework.week1.hw3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "No";
        System.out.println("Input 6 numbers:");
        for(int i = 0; i<6; i++){
            int inp = input.nextInt();
            if(inp == 10){
                a = "Yes";
            }
        }
        System.out.println(a);
    }
}
