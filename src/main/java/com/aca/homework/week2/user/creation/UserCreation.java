package com.aca.homework.week2.user.creation;

public class UserCreation {
    public static void main(String[] args) {
        User[] users = new User[3];
        User user = inputUser("Mary", 170);
        users[0] = user;
        user = inputUser("Grace", 169);
        users[1] = user;
        user = inputUser("Nicolos",175);
        users[2] = user;
        printUser(users[0]);
        printUser(users[1]);
        printUser(users[2]);
    }
    public static User createUser(String name,int height){
        User user = new User();
        user.name = name;
        user.height = height;
        return user;
    }
    public static void printUser(User user){
        System.out.println("The name is: " + user.name +" " + user.name + "'s, height is: " + user.height);
    }

}
