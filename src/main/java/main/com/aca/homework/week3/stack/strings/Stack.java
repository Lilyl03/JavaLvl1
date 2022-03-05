package com.aca.homework.week3.stack.strings;

public class Stack {
    private String[] strings = new String[10];
    private int cnt = 0;
    public void push(String string){
        strings[cnt] = string;
        cnt++;
    }
    public String pop(){
        cnt--;
        String popped = strings[cnt];
        strings[cnt] = null;
        return popped;
    }
}
