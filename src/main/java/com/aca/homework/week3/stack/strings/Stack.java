package com.aca.homework.week3.stack.strings;

public class Stack {
    private String string;
    private String[] s;
    private int cnt;
    private String[] sPop;
    public String[] pop(int popCount){
        if(popCount < cnt){
        this.sPop = new String[popCount+1];
        for(int i = popCount, l= 0;i>=0 && l<=popCount;i--, l++){
            this.sPop[l] = s[i];
            this.s[i] = null;

        }}else{
            throw new ArrayStoreException("your input is bigger than array");
        }
        return this.sPop;
    }

    public void push(String[] s,int cnt){
        this.cnt = cnt;
        this.s = new String[this.cnt];
        for(int i = 0 ; i<this.s.length;i++){
            if(s[i] != ""){
                this.s[i] = s[i];
            }
        }
    }

}
