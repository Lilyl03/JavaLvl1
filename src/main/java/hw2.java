import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weekday = input.nextInt();
        System.out.println(funcDayOfWeek(weekday));
    }
    //#1
    public static String funcWeird(int n){
        if(n<=0){
            return "n is not positive";
        }else{
        if(n % 2 != 0){
            return "Weird";
        }else if(n >= 2 && n <= 5){
            return "Not Weird";
        }else if(n >= 6 && n <= 20){
            return "Weird";
        }else{
            return "Not Weird";
        }}
    }
    //#2
    public static void func10Multiplies(int n){
        for(int i = 1; i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
    //#3
    public static void funcQuadratic(double a , double b, double c){
        double d = (b * b)- (4*a*c);
        if(d>0){
        double sqrtd = Math.sqrt(d);
        double x1 = (-b + sqrtd) / 2 * a;
        double x2 = (-b - sqrtd) / 2 * a;
            System.out.println("The roots are " + x1 + " and " + x2);
        }else if(d == 0){
            double x =  Math.sqrt(c);
            int xn = (int) x;
            if(x- xn == 0){
                System.out.println("The root is " + xn);
            }else{
                System.out.println("The root is " + x);
            }

        }else{
           d = -d;
           double sqrtd = Math.sqrt(d);
           String str1 = "(" + (-b) + " + i * " + sqrtd + ")/2";
           String str2 = "(" + (-b) + " - i * " + sqrtd + ")/2";
            System.out.println("The roots are " + str1 + "a nd " + str2);
        }

    }
    //#4
    public static void funcNegOrPos(double n){
        int n0 = (int)n;
        int n1;
        if(n-n0==0){
            n1 = n0;
        if(n1>0 && Math.abs(n1)<1){
            System.out.println("Input Value:" + n1);
            System.out.println("Positive, small number");
        }else if(n1<0 && Math.abs(n1)<1){
            System.out.println("Input Value:" + n1);
            System.out.println("Negative,small number");
        }else if(n1>0 && Math.abs(n1)> 1_000_000){
            System.out.println("Input Value:" + n1);
            System.out.println("Positive, large number");
        }else if(n1<0 && Math.abs(n1)> 1_000_000){
            System.out.println("Input Value:" + n1);
            System.out.println("Negative, large number");
        }else{
            if(n1>0){
                System.out.println("Input Value:" + n1);
                System.out.println("Positive number");
            }else if(n1<0){
                System.out.println("Input Value:" + n1);
                System.out.println("Negative number");
            }else{
                System.out.println("Input Value:" + n1);
                System.out.println("Zero");
            }}
        }else{
            if(n>0 && Math.abs(n)<1){
                System.out.println("Input Value:" + n);
                System.out.println("Positive, small number");
            }else if(n<0 && Math.abs(n)<1){
                System.out.println("Input Value:" + n);
                System.out.println("Negative,small number");
            }else if(n>0 && Math.abs(n)> 1_000_000){
                System.out.println("Input Value:" + n);
                System.out.println("Positive, large number");
            }else if(n<0 && Math.abs(n)> 1_000_000){
                System.out.println("Input Value:" + n);
                System.out.println("Negative, large number");
            }else{
                if(n>0){
                    System.out.println("Input Value:" + n);
                    System.out.println("Positive number");
                }else if(n<0){
                    System.out.println("Input Value:" + n);
                    System.out.println("Negative number");
                }else{
                    System.out.println("Input Value:" + n);
                    System.out.println("Zero");
    }
}
        }
    }

    //#5
    public static String funcDayOfWeek(int n){
        switch (n){
            case 1 :
                return "Monday";
            case 2 :
                return "Tuesday";
            case 3 :
                return "Wednesday";
            case 4 :
                return "Thursday";
            case 5 :
                return "Friday";
            case 6 :
                return "Saturday";
            case 7 :
                return "Sunday";
            default :
                return "There is no such weekday";

        }
    }
    //#6
    public static String funcThreeDec(double n1,double n2){
        return "";
    }
}
