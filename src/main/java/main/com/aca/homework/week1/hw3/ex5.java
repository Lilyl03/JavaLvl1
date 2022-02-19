package com.aca.homework.week1.hw3;

import java.util.Scanner;

public class ex5 {
  	public static void main(String[] args) {
	  int[] arr = new int[10];
	  Scanner input = new Scanner(System.in);
	  System.out.println("Input 10 numbers:");
	   for(int i = 0; i< 10; i++){
	      int inpt = input.nextInt();
	      arr[i] = inpt;
	  }
	  for(int i = 0; i< 10; i++){
	      for(int j = 0; j<10; j++){
	          double  div = (double)arr[i] / arr[j];
	          System.out.println(arr[i] + " / " + arr[j] + " = " + div);
	           	              }
	  }
	}
}
