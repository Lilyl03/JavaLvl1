package com.aca.homework.week3.stack.strings;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        int cnt = 0;
        String[] strings = new String[10];
        System.out.println("Enter strings for push:");
        System.out.println("(Click Enter twice to end your input)");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String l= input.nextLine();
            if(l!= ""){
                cnt++;
                strings[i] = l;
            }else{
                break;
            }
        }
        System.out.println("Enter the number for pop:");
        int k = input.nextInt();
        Stack stack = new Stack(cnt,k-1);
        stack.push(strings);
        String[] strings1 = stack.pop();
        System.out.println("The poped strings:");
        for(String s: strings1){
            System.out.println(s);
        }
    }
}
