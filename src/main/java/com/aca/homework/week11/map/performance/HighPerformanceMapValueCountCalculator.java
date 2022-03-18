package com.aca.homework.week11.map.performance;

import java.util.HashMap;
import java.util.Map;

public class HighPerformanceMapValueCountCalculator implements MapValueCountCalculator{
    private HashMap<String, Integer> hashMap;

    public static void main(String[] args) {
        System.out.println(new HighPerformanceMapValueCountCalculator().populateAndCalculate(400000));
    }
    @Override
    public String populateAndCalculate(int numberOfRandomStrings) {
      hashMap = new HashMap<>(numberOfRandomStrings,0.1f);
        String randomString;
        for (int i = 0; i < numberOfRandomStrings; i++) {
            randomString = Randomizer.randomString();
            add(randomString);
        }
        return "The key and value for maximum is : " + getByValue(maxPopulateCount()) + " " + maxPopulateCount() + "\nThe key and value for minimum is : " + getByValue(minPopulateCount()) + " " + minPopulateCount();
    }

    private void add(String randomString) {
        if (hashMap.containsKey(randomString)) {
            Integer value = hashMap.get(randomString);
            hashMap.put(randomString, ++value);
        } else {
            hashMap.put(randomString, 1);
        }
    }

    private Integer maxPopulateCount() {
        Integer[] values = hashMap.values().toArray(new Integer[0]);
        Integer max = values[0];
        for (int i = 1; i < values.length; i++) {
            max = Math.max(max, values[i]);
        }
        return max;
    }

    private Integer minPopulateCount() {
        Integer[] values = hashMap.values().toArray(new Integer[0]);
        Integer min = values[0];
        for (int i = 1; i < values.length; i++) {
            min = Math.min(min, values[i]);
        }
        return min;
    }

    private String getByValue(Integer value) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
