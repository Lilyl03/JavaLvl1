package com.aca.homework.week3.stack.strings;

public class Stack {
    private String[] s;
    private int cnt;
    private int popCount;
    private String sPop;
    public Stack(int cnt , int popCount){
        this.cnt = cnt;
        this.popCount = popCount;
    }
    public String pop(){
        if(popCount < cnt){
        this.sPop = "";
        for(int i = popCount, l= 0;i>=0 && l<=popCount;i--, l++){
            this.sPop += s[i] + '\n';
            this.s[i] = null;

        }}else{
            throw new ArrayStoreException("your input is bigger than array");
        }
        return this.sPop;
    }

    public void push(String[] s){
        this.s = new String[this.cnt];
        for(int i = 0 ; i<this.s.length;i++){
            if(s[i] != ""){
                this.s[i] = s[i];
            }
        }
    }

}
