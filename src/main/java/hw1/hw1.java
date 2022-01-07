package hw1;

public class hw1 {
    public static void main(String[] args) {
    }
    //#11
    public static int funcMax(int num1,int num2,int num3){
        int max;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        num3 = Math.abs(num3);
        if(num1>= num2 && num1>=num3){
            max = num1;
        }else if(num2>=num1 && num2 >= num3){
            max = num2;
        }else{
            max = num3;
        }
        if(max <0){
            max = (-1) * max;
        }
        return max;
    }
    //#2
    public static int funcMin(int num1, int num2, int num3){
        int min;
        if(num1<=num2 && num1 <= num3){
            min = num1;
        }else if(num2<= num1 && num2 <= num3){
            min = num2;
        }else{

            min = num3;
        }
        return min;
    }
    //#3
    public static void funcOperation(int num1,int num2, int op){
        if (op == 1){
            System.out.println(num1 + num2);
        }else if(op ==2){
            System.out.println(num1 - num2);
        }else if(op == 3){
            System.out.println(num1 *num2);
        }else if(op ==4){
            try {
                System.out.println(num1 / num2);
            }
            catch (ArithmeticException e) {
                System.out.println(
                        "Divided by zero operation cannot be possible");
            }
        }else{
            System.out.println("Given operation isn't available ");
        }
    }
}
