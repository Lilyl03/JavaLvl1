package hw3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your Name:");
        //name
        String name = input.nextLine();
        System.out.println("Input your Passport Name:");
        //passportname
        String passportname = input.nextLine();
        System.out.println("Input your Age:");
        //age
        int age = input.nextInt();
        System.out.println("Input your Passport Age:");
        //passportage
        int passportage = input.nextInt();
        boolean isNameSame = isNameSame(name,passportname);
        boolean isAgeSame = isAgeSame(age,passportage);
        boolean isAgeGT18 = isAgeGT18(age);
        System.out.println(isNameSame && isAgeSame && isAgeGT18 ? "yes" : "no");


    }
    public static boolean isNameSame(String name1,String name2){
        return name1.equalsIgnoreCase(name2);
    }
    public static boolean isAgeSame(int age1, int age2){
        return age1 == age2;
    }
    public static boolean isAgeGT18(int age){
        return age > 18;
    }
}
