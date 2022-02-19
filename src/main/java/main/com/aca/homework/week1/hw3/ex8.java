package com.aca.homework.week1.hw3;

import java.util.Scanner;

public class ex8 {
 public static void main(String[] args) {
        char ship = '*';
        char hit = 'x';
        char[][] board = {
                {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'},
                {'1', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'2', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'3', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'4', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'5', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'6', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'7', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'8', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'9', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'0', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };


        placeShip(board,ship,6);
        placeShip(board,ship,5);
        placeShip(board,ship,5);
        placeShip(board,ship,3);
        placeShip(board,ship,3);

        Scanner input = new Scanner(System.in);
        for(int i = 0; i< 2;i++){
        System.out.println("Give the  coordinates for "+ 1 +" block ship");
        System.out.print("x:" );
        int x = input.nextInt();
        System.out.print("y:" );
        int y = input.nextInt();
        while((x <=0 || x >=11) && (y <=0 || y >=11)){
            System.out.println("Wrong Coordinates");
            System.out.print("x:" );
            x = input.nextInt();
            System.out.print("y:" );
            y = input.nextInt();
        }
        board[x][y] = '*';
        }
        for(char[] rows : board){
            System.out.println(rows);
        }


    }
    public static void placeShip(char[][] board,char ship,int shipLength){
        Scanner input = new Scanner(System.in);
        System.out.println("Give the  coordinates for "+ shipLength +" block ship");
        System.out.println("1 coordinates:  ");
        System.out.print("x:" );
        int x = input.nextInt();
        System.out.print("y:" );
        int y = input.nextInt();
        while((x <=0 || x >=11) && (y <=0 || y >=11)){
            System.out.println("Wrong Coordinates");
            System.out.print("x:" );
            x = input.nextInt();
            System.out.print("y:" );
            y = input.nextInt();
        }
        int x1 = x;
        int y1 = y;
        int xn = 0;
        int yn = 0;
        int minx = x;
        int miny = y;
        int[] coord = new int[shipLength];
        for(int i = 1; i<shipLength; i++){
            System.out.println((i+1) +" coordinates:  ");
            System.out.print("x:" );
            xn = input.nextInt();
            System.out.print("y:" );
            yn = input.nextInt();
            if((xn>=1 && xn<=10) && (yn >=1  && yn<=10)) {
                if (xn == x1) {
                    coord[0] = miny;
                    if (yn == y1 + 1) {
                        if(board[xn][yn] == ' '){
                        board[xn][yn] = '*';
                        y1 = yn;
                        coord[i] = y1;}
                        else{
                            System.out.println("The coordinates are already used");
                            i--;
                        }

                    }else if(yn == y-1){
                        if(board[xn][yn] == ' '){
                        coord[0] = miny;
                        board[xn][yn] = '*';
                        y = yn;
                        coord[i] = y;}
                        else{
                            System.out.println("The coordinates are already used");
                            i--;
                        }
                    }else{
                        System.out.println("Wrong coordinates");
                        i--;
                    }
                }else if(yn == y1){
                    if (xn == x1 + 1) {
                        if(board[xn][yn] == ' '){
                        coord[0] = minx;
                        board[xn][yn] = '*';
                        x1 = xn;
                        coord[i] = x1;}
                        else{
                            System.out.println("The coordinates are already used");
                            i--;
                        }
                    }else if(xn == x-1){
                        if(board[xn][yn] == ' '){
                        coord[0] = minx;
                        board[xn][yn] = '*';
                        x = xn;
                        coord[i] = x;}
                        else{
                            System.out.println("The coordinates are already used");
                            i--;
                        }

                    }else{
                        System.out.println("Wrong coordinates");
                        i--;
                    }
                }else{
                    System.out.println("Wrong coordinates");
                    i--;
                }
            }else{
                System.out.println("Wrong Coordinates");
                i--;
            }
        }

        if(xn == x){
            int minny= coord[0];
            int maxxy = coord[0];
       for(int i = 1 ; i < coord.length;i++){
           minny = Math.min(minny,coord[i]);
           maxxy = Math.max(maxxy,coord[i]);
       }
           for(int i = minny; i<maxxy;i++){
               board[xn][i] = '*';
           }

        }
        else if(yn == y){
            int minnx= coord[0];
            int maxxx = coord[0];
            for(int i = 1 ; i < coord.length;i++){
                minnx = Math.min(minnx,coord[i]);
                maxxx = Math.max(maxxx,coord[i]);

            }
            for(int i1 = minnx; i1<maxxx;i1++){
                board[i1][yn] = '*';
            }
        }

    }
}
