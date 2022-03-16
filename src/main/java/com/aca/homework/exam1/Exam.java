package com.aca.homework.exam1;

import java.util.Scanner;

public class Exam {

   private long[] nums;
   private long max;
   private long min;

   public void input(){
       nums = new long[5];
       Scanner input = new Scanner(System.in);
       System.out.println("Enter 5 numbers:");
       for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextLong();
       }


   }

   public void operation(){
       System.out.println("Enter the operation number 1-8:");
       Scanner input = new Scanner(System.in);
       int num1 = input.nextInt();
       while(num1!=8){
           check(num1);
           System.out.println();
           System.out.println("Enter the operation number 1-8:");
           num1 = input.nextInt();
       }
   }

    public long max(){
           this.max = nums[0];
           for(int i =1; i<nums.length; i++){
               if(this.max < nums[i]){
                   this.max = nums[i];
               }
           }
        return this.max;
   }

    public long min(){
        this.min = nums[0];
        for(int i =1; i<nums.length; i++){
            if(this.min > nums[i]){
                this.min = nums[i];
            }
        }
        return this.min;
    }

    public void multiply(){
        long[] num2 = new long[nums.length];
        for(int i = 0; i < nums.length; i++){
            num2[i] = 2 * nums[i];

        };
        for(int i = 0; i< nums.length; i++){
            System.out.println(nums[i] + " *  2 = " + num2[i]);
        }
    }

    public void avg(){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += this.nums[i];
        }
        System.out.println((double)sum/nums.length);
    }

    public void nthSequence(){
        System.out.println("Enter the n to  print n-th member:");
        int n = new Scanner(System.in).nextInt();
        int k = 0;
        while(k == 0){
            if(n >= 1 && n <= nums.length){
                System.out.println("The " +  n + "-th member " + this.nums[n-1]);
                break;
            }else{
                System.out.println("Wrong sequence number");
                n = new Scanner(System.in).nextInt();
                k = 0;
            }
        }
    }

    public void countZero(){
        int cnt = 0;
        long[] num = new long[nums.length];
        for(int i = 0; i< num.length; i++) {
            num[i] = nums[i];
        }
        for(int i = 0; i< num.length; i++){
            while(num[i] != 0){
                if(num[i] % 10 == 0){
                    cnt++;
                }
                num[i] /= 10;
            }
        }
        System.out.println(cnt);
    }
   public void check(int num1){
       switch (num1){
           case 1 :
               System.out.println("The maximum is: " + max());
               break;
           case 2 :
               System.out.println("The minimum is: " + min());
               break;
           case 3:
                multiply();
                 break;
           case 4:
               System.out.println("The average is: ");
               avg();
               break;
           case 5:
               nthSequence();
               break;
           case 6:
               System.out.println("The difference of max and min is: " + (max() - min()));
               break;
           case 7 :
               System.out.println("The ZeroCount is:");
               countZero();
               break;
       }}
   }

