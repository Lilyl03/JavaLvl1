package com.aca.homework.week3.classroom;

public class AcaClass {
    Student[] students;
    long startMillis;
    long endMillis;
    String name;
    long fee;

    public static void main(String[] args) {
        AcaClass acaClass = new AcaClass();
        acaClass.startMillis = 1_640_980_800;
        acaClass.endMillis = 1_651_348_800;
        acaClass.name =  "java level 1";
        acaClass.fee = 500000;
        acaClass.students[0].name = "Lisa";
        acaClass.students[0].surname = "La";
        acaClass.students[1].name = "Susan";
        acaClass.students[1].surname = "Santiago";
    }
}
