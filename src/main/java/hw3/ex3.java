package hw3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        System.out.println("Input 100 Numbers:");
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        for(int i = 0 ; i<100;i++){
            int inpt = input.nextInt();
            cnt += inpt;
        }
        System.out.println(cnt);
    }

}
