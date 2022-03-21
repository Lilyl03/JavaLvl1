package com.aca.exam.exam2;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSourceUserRepository implements CrudRepository<User,String>{

    @Override
    public @Nullable User findById(String id) throws FileNotFoundException {
        ArrayList<User> arrayList = readFile(new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\JavaLvl1\\src\\main\\java\\com\\aca\\exam\\exam2\\users.txt")));
        for (User user : arrayList) {
            if(user.getId().equals(id)){
                return user;
            }
        }
        throw new IllegalArgumentException("The Id you entered was incorrect");
    }

    @Override
    public List<User> findAll() throws FileNotFoundException {
        return readFile(new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\JavaLvl1\\src\\main\\java\\com\\aca\\exam\\exam2\\users.txt")));
    }

    public static ArrayList<User> readFile(Scanner scanner){
        ArrayList<User> arrayList = new ArrayList<>();
        while(scanner.hasNextLine()){
            String[] userInformation = scanner.nextLine().split(",");
            arrayList.add(new User(userInformation[0], userInformation[1], userInformation[2]));
        }
        return arrayList;
    }
}
