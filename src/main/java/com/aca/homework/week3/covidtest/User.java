package com.aca.homework.week3.covidtest;

public class User {
    String code;
    String name;

    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Mark";
        user1.code = "mark789";
        User user2 = new User();
        user2.name = "Jane";
        user2.code = "jane45";
        User user3 = new User();
        user3.name = "Kate";
        user3.code = "kate876&";
        User[] users = {user1,user2,user3};
    }
    public void print(){
        System.out.print("name: " + name + " code: " + code);
    }

}
