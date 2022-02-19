package com.aca.homework.week2.maxmin;

import java.util.Scanner;

public class MaxMinTest {
    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        System.out.println("Enter 2 numbers:");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        maxMin = maxMin(num1,num2);
        System.out.print("Max:");
        System.out.println(maxMin.max);
        System.out.print("Min:");
        System.out.println(maxMin.min);
    }
    public  static MaxMin maxMin(int num1, int num2){
        MaxMin maxMin = new MaxMin();
        if(num1>num2){
            maxMin.max= num1;
            maxMin.min= num2;
        }else{
            maxMin.max= num2;
            maxMin.min= num1;
        }
        return maxMin;
    }

}
