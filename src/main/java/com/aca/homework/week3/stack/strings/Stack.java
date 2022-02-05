package com.aca.homework.week3.stack.strings;

import java.util.Scanner;

public class Stack {
    private String[] s;
    private int popCount;

    public void pop() {
        System.out.println("The poped strings:");
        if (popCount < s.length) {
            for (int i = s.length - 1; i >= s.length - popCount; i--) {
                System.out.println(s[i]);
            }
        } else {
            throw new ArrayStoreException("your input is bigger than array");
        }
        s = null;
    }

    public void push(String s) {
        this.s = s.split("\n");
    }
    public String input(){
        String strings = "";
        System.out.println("Enter strings for push:" + '\n' + "(Click Enter twice to end your input)");
        String l = new Scanner(System.in).nextLine();
        while(l != ""){
            strings += l + '\n';
            l = new Scanner(System.in).nextLine();
        }
        System.out.println("Enter the number for pop:");
        this.popCount = new Scanner(System.in).nextInt();
        return strings;
    }

}
