package com.aca.homework.week11.occurence;

import java.util.HashMap;
import java.util.Scanner;

public class KeyCalculator {

    public HashMap<String,Integer> askAndCalculate(){
        HashMap<String,Integer> integerHashMap = new HashMap<>();
        String i = new Scanner(System.in).nextLine();
        while (!i.equalsIgnoreCase("end")) {
            if(i.equalsIgnoreCase("end")){
                return integerHashMap;
            }else {
                if (integerHashMap.containsKey(i)) {
                    integerHashMap.put(i, (integerHashMap.get(i) +1));
                } else {
                    integerHashMap.put(i, 1);
                }
            }
            i = new Scanner(System.in).nextLine();
        }

        return integerHashMap;
    }
}
