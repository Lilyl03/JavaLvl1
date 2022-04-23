package com.aca.homework.week11.map.performance;

import java.util.Random;

public class Randomizer {
    public static String randomString(){
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            stringBuilder.append(letters[new Random().nextInt(0,5)]);
        }
        return String.valueOf(stringBuilder);
    }
}
