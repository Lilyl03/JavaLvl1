package com.aca.homework.week10.list.copy;

import java.util.*;

public class ListUtils<T> {
    private ListUtils() {
    }
    public static <T>List<T> copy(List<T> list){
        List<T> listCopy = new ArrayList<>();
        for (T t : list) {
            listCopy.add(t);
        }
        return listCopy;
    }
}
