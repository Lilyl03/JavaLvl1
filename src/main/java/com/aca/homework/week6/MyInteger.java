package com.aca.homework.week6;

public class MyInteger {
    private final int value;
    private static final MyInteger[] myIntegers = new MyInteger[201];

    public MyInteger(int value) {
        this.value = value;
    }
    
    public static MyInteger valueOf(int value){
        if(value < -100 || value > 100) {
            return new MyInteger(value);
        }else {
            return cache(value);
        }
    }

    private static MyInteger cache(int value) {
        return check(value) ? myIntegers[value + 100] = new MyInteger(value) : myIntegers[value+100];
    }

    private static boolean check(int value) {
      return myIntegers[value + 100] == null;
    }


    public int getValue() {
        return value;
    }
}