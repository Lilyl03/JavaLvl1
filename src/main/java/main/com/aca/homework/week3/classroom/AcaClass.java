package main.com.aca.homework.homework.week3.classroom;

public class AcaClass {
    Student[] students;
    long startMillis;
    long endMillis;
    String name;
    long fee;

    public static void main(String[] args) {
        AcaClass acaClass = new AcaClass();
        Student student1 = new Student();
        student1.name = "Lisa";
        student1.surname = "La";
        Student student2 = new Student();
        student2.name = "Susan";
        student2.surname = "Santiago";
        Student[] student = {student1,student2};
        acaClass.startMillis = 1_640_980_800;
        acaClass.endMillis = 1_651_348_800;
        acaClass.name =  "java level 1";
        acaClass.fee = 500000;
        acaClass.students = student;
    }
}
