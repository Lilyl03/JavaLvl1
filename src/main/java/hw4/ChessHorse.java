package hw4;

import java.util.Scanner;

public class ChessHorse {
    public static void main(String[] args) {
        String[] boardLet = {"a","b","c","d","e","f","g","h"};
        System.out.println("Enter the coordinates:");
        Scanner input = new Scanner(System.in);
        String coordinates = input.nextLine();
        String[] coord = coordinates.split("-");
        int coord1 = 0;
        int coord2 = Integer.parseInt(coord[0].substring(1,2));
        for(int i =0 ; i < boardLet.length;i++){
            if(boardLet[i].equals(coord[0].substring(0,1))){
                coord1 = i;
                break;
            }else{
                System.out.println("No");
            }
        }
        if(Integer.parseInt(coord[1].substring(1,2)) >=1 && Integer.parseInt(coord[1].substring(1,2))<=8 ){
            if((coord[1].equals (boardLet[coord1+1] + (coord2 + 2))) || (coord[1].equals (boardLet[coord1-1] + (coord2 + 2))) || (coord[1].equals (boardLet[coord1+1] + (coord2 - 2))) || (coord[1].equals (boardLet[coord1-1] + (coord2 - 2)))|| (coord[1].equals (boardLet[coord1 - 2] + (coord2 + 1))) || (coord[1].equals (boardLet[coord1-2] + (coord2 - 1)))|| (coord[1].equals (boardLet[coord1+2] + (coord2 +1))) || (coord[1].equals (boardLet[coord1+2] + (coord2 - 1)))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }}else{
            System.out.println("No");

        }}
}
