package com.aca.homework.week6;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger myInteger1 = MyInteger.valueOf(23);
        MyInteger myInteger2 = MyInteger.valueOf(70);
        MyInteger myInteger3 = MyInteger.valueOf(-456);
        MyInteger myInteger4 = MyInteger.valueOf(0);
        MyInteger myInteger5 = MyInteger.valueOf(70);
        System.out.println(myInteger1.getValue());
        System.out.println(myInteger2.getValue());
        System.out.println(myInteger3.getValue());
        System.out.println(myInteger4.getValue());
        System.out.println(myInteger5.getValue());

    }

}
