package com.aca.homework.week2.pattern;

import java.util.Scanner;

public class PatternTest {
    public static void main(String[] args) {
        char[][] board = new char[5][5];
        fillArray(board);
        Scanner input = new Scanner(System.in);
        System.out.println("Please write 1 to use addPattern3Right and 2 for addPattern2Right2Top:");
        int choice = input.nextInt();
        System.out.println("Please write the i: ");
        int i =input.nextInt();
        System.out.println("Please write the k: ");
        int k =input.nextInt();
        System.out.println("Before");
        printArray(board);
        if(choice == 1){
            addPattern3Right(board,choice,i,k);
            System.out.println("After");
            printArray(board);
        }else if(choice == 2){
            addPattern2Right2Top(board,choice,i,k);
            System.out.println("After");
            printArray(board);
        }else{
            System.out.println("Your input was incorrect");
        }
    }
    public static void printArray(char[][] board) {
        for (int i = 0; i< board.length; i++){
            for (int k = 0; k < board[i].length;k++){
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] fillArray(char[][] board) {
        for (int i = 0; i< board.length; i++){
            for (int k = 0; k < board[i].length;k++){
                board[i][k] = '0';
            }
        }
        return board;
    }

    public static char[][] addPattern2Right2Top(char[][] board, int choice, int i, int k) {
        if(k+2<=5 && i-2>0 && i-2<5){
            for(int j = k; j < k+2; j++){
                board[i][j] = '*';
            }
            for(int l = i; l>=i-2;l--){
                board[l][k+1] = '*';
            }}
        return board;
    }

    public static char[][] addPattern3Right(char[][] board, int choice, int i, int k) {
        if(k+3 <= 5 && i<5){
            for(int j = k; j < k+3; j++){
                board[i][j] = '*';
            }}
        return board;
    }
}
