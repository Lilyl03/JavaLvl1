package com.aca.homework.week4.json.processor;

import java.util.Scanner;

public class StringProcessor {
    private String json;

    public static void main(String[] args) {
        System.out.println("Please enter a  json string:");
        String key = new Scanner(System.in).nextLine();
        StringProcessor stringProcessor = new StringProcessor(key);
        do {
            System.out.println();
            System.out.println("please input a field name:");
            key = new Scanner(System.in).nextLine();
            stringProcessor.getValue(key);
        } while (!key.equals("end"));
    }

    public StringProcessor(String json) {
        this.json = json.substring(1, json.length() - 1);
    }

    public void getValue(String key) {
        String[] keysAndValues = json.split(",");
        for (int i = 0; i < keysAndValues.length; i++) {
            String[] value = keysAndValues[i].split(":");
            if (value[0].replace("\"", "").replace(" ", "").equals(key)) {
                System.out.println(value[1].replace("\"", "").replace(" ", ""));
                break;
            }
        }

    }
}

