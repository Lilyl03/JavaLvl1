package com.aca.homework.week11.map.performance;

import java.util.Scanner;

public class MapValueCountCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the MapValueCalculator type: ");
        if(scanner.nextLine().equalsIgnoreCase("high")){
            System.out.println("Enter randomString number: ");
            long start = System.currentTimeMillis();
            System.out.println(new HighPerformanceMapValueCountCalculator().populateAndCalculate(scanner.nextInt()));
            System.out.println(System.currentTimeMillis()-start);
        }else{
            System.out.println("Enter randomString number: ");
            long start = System.currentTimeMillis();
            System.out.println(new LowPerformanceMapValueCountCalculator().populateAndCalculate(scanner.nextInt()));
            System.out.println(System.currentTimeMillis()-start);
        }

    }
}
