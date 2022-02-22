package com.aca.homework.week3.stack.strings;

public class Stack {
    private String[] stacks = new String[10];
    private int cnt = 0;
    public void push(String string){
        stacks[cnt] = string;
        cnt++;
    }
    public void pop(){
        cnt--;
        System.out.println(stacks[cnt]);
        stacks[cnt] = null;

    }
}
