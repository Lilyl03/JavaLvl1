package com.aca.homework.week6.list;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 40; i++) {
            arrayList.add("hi " + i);
        }
        for (int i = 0; i < 40; i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.get(50);


    }
}
