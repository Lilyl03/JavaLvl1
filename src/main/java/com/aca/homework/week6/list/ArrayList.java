package com.aca.homework.week6.list;

public class ArrayList implements List {
    private String[] strings = new String[10];
    private int pointer;
    private int length = strings.length;

    @Override
    public void add(String element) {
        if (pointer < length) {
            strings[pointer] = element;
            pointer++;
        } else {
            doubleArray();
            strings[pointer] = element;
            pointer++;
        }

    }

    private String[] doubleArray() {
        String[] strings1 = new String[strings.length * 2];
        fill(strings1);
        length *= 2;
        strings = strings1;
        return strings;
    }

    private String[] fill(String[] strings) {
        for (int i = 0; i < length; i++) {
            strings[i] = this.strings[i];
        }
        return strings;
    }


    @Override
    public String get(int index) {
        if (index >= 0 && index <= length) {
            return strings[index];
        }
        throw new RuntimeException(index + " is empty");
    }

}
