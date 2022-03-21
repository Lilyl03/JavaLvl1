package com.aca.exam.exam2;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSourceOrderRepository implements CrudRepository<Order, Integer>{

    @Override
    public @Nullable Order findById(Integer integer) throws FileNotFoundException, IllegalArgumentException {
        ArrayList<Order> arrayList = readFile(new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\JavaLvl1\\src\\main\\java\\com\\aca\\exam\\exam2\\orders.txt")));
        for (Order order : arrayList) {
            if(order.getId() == integer){
                return order;
            }
        }
        throw new IllegalArgumentException("The Id is not found");
    }

    @Override
    public List<Order> findAll() throws FileNotFoundException {
        return readFile(new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\JavaLvl1\\src\\main\\java\\com\\aca\\exam\\exam2\\orders.txt")));
    }

    public static ArrayList<Order> readFile(Scanner scanner) throws FileNotFoundException {
        ArrayList<Order> arrayList = new ArrayList<>();
        while(scanner.hasNextLine()){
            String[] orderInformation = scanner.nextLine().split(",");
            arrayList.add(new Order(Integer.parseInt(orderInformation[0]),orderInformation[1], Integer.parseInt(orderInformation[2]),new FileSourceUserRepository().findById(orderInformation[3])));
        }
        return arrayList;
    }

}
