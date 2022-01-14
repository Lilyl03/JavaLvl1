package hw3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int cnt = 0;
        System.out.println("Input 20 numbers in range [0,100]");
        for(int i = 0; i < 20; i++){
            int inpt = readNumber();
            if(checkNumber(inpt)){
                arr[i] = inpt;
            }else{
                System.out.println(" the input number is out of range ");
                i--;
            }
        }
        for(int k : arr){
            cnt += k;
        }
        System.out.println(cnt);

    }
    public static int  readNumber(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static boolean checkNumber(int inpt){
        return inpt>=0 && inpt <=100;
    }

}
