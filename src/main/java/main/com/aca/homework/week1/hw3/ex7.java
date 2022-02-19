package com.aca.homework.week1.hw3;

import java.util.Scanner;

public class ex7 {
  	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Input the term for Fibonacci sequence:");
	  int n = input.nextInt();
	  int n0 = 0;
	  int n1 = 1;
	  int nk = n0 +n1;
	  int cnt = nk + n1;
	  System.out.println("The sum of the "+ n + " term sequence of Fibonacci is: ");
	  for(int i = 0 ; i< n-3; i++){
	      n0 = n1;
	      n1 = nk;
	      nk = n0 + n1;
	      cnt +=nk;
	  }
	  System.out.println(cnt);
	}
}
