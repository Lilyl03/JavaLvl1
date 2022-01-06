import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        
    }
    //#1
    public static String funcWeird(){
         System.out.println("Input a number:");
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         
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
    public static void func10Multiplies(){
        System.out.println("Input a number:");
        Scanner input = new Scanner(System.in);
         int n = input.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
    //#3
    public static void funcQuadratic(){
        System.out.println("Input number:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
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
    public static void funcNegOrPos(){
        System.out.println("Input a number:");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
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
    public static String funcDayOfWeek(){
        System.out.println("Input a number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
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
    public static String funcSameOrDifer(){
        System.out.println("Input number:");
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
	    int n11 = (int)(n1*1000);
	    int n12 = (int)(n2*1000);
	    int div1,div2;                
	    while(n11!=0){
	        div1 = n11%10;
	        div2 = n12%10;
	        n11 = n11/10;
	        n12 = n12/10;
	        if(div1!=div2){
	            return "They are different";
	        }
	    }
	    return "They are the same";
	}
	//#7
	public static String funcdaysInMonth(){
	    System.out.println("Input a month number:");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        System.out.println("Input a year :");
        int  year = input.nextInt();
	    switch(month){
	        case 1:
	            return "January" + year + " has 31 days";
	        case 2:
	            if (year % 400 == 0 ||( year % 100 != 0 && year % 4 == 0)){
	               return "Feburary " + year + " has 29 days";
	            }
	            return "Feburary " + year + " has 28 days";
	        case 3:
	            return "March " + year + " has 31 days";
	        case 4:
	            return "April " + year + " has 30 days";
	        case 5:
	            return "May " + year + " has 31 days";
	        case 6:
	            return "June " + year + " has 30 days";
	        case 7:
	            return "July " + year + " has 31 days";
	        case 8:
	            return "August " + year + " has 31 days";
	        case 9:
	            return "September " + year + " has 30 days";
	       case 10:
	            return "October " + year + " has 31 days";
	       case 11:
	            return "November " + year + " has 30 days";
               case 12:
	            return "December " + year + " has 31 days";
               default: 
                    return "This month does not exist";
	    }
	}
	//#8
	public static String funcCheckChar(){
	    System.out.println("Input an alphabet:");
	    Scanner input = new Scanner(System.in);
	    String char1 = input.nextLine();
	    if(char1.length() == 1){
	        if((char1.codePointAt(0)>=65 && char1.codePointAt(0)<=90) || (char1.codePointAt(0)>=97 && char1.codePointAt(0)<=122)){
	            char1 = char1.toLowerCase();
	            if(char1 == "a" || char1 == "o" || char1 == "i" || char1 == "u" || char1 == "e"){
	                return "Input letter is Vowel";
	            }else{
	                return "Input letter is Consonant";
	            }
	        }
	    }
	     return "Your input is not a letter";
	}
	//#9
	public static String funcLeapOrNot(){
	    System.out.println("Input a year :");
	    Scanner input = new Scanner(System.in);
        int  year = input.nextInt();
         if (year % 400 == 0 ||( year % 100 != 0 && year % 4 == 0)){
	               return  year + " is a leap year";
	            }
	     return year + " is not a leap year";
    }
	//#10
	 public static void natNums10(){
        String str = "";
        for(int i=1;i<=10;i++){
            str += i + ", ";
        }
        System.out.println("The first 10 natural numbers are:"); 
        System.out.println(str.substring(0,str.length()-2)); 
    }
	//#11
	public static void funcNTerm(){
	    System.out.println("Input a number:");
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
        int cnt = 0;
        String str = "";
        if(n>0){
        for(int i =1; i<=n; i++){
            cnt+=i;
            str += i + ", ";
        }
        str = str.substring(0,str.length()-2);
        System.out.println("Input number:");
        System.out.println(n);
        System.out.println("The first " + n + " natural numbers are :");
        System.out.println(str);
        System.out.println("The Sum of Natural Number upto " + n + " terms :");
        System.out.println(cnt);
            
        }else{
            System.out.println("n is not a natural number");
        }
    }
	//#12
	public static void funcSumAndAver(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the 5 numbers :");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        System.out.println("Inserted 5 numbers");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println("The sum of 5 no is : " + (n1+n2+n3+n4+n5));
        System.out.println("The Average is :" + (double)(n1+n2+n3+n4+n5)/5);
    }
	//#13
	  public static void funcCube(){
          System.out.println("Input number of terms :"); 
          Scanner input = new Scanner(System.in);
          int n = input.nextInt();
          if(n>0){
              for(int i =1; i<= n; i++){
                  System.out.println("Number is : " + i + " and cube of " + i + " is: " + (i*i*i));
              }
          }else if(n<0){
              for(int i = n; i<0; i++){
                  System.out.println("Number is : " + i + " and cube of " + i + " is: " + (i*i*i));
              }
          }else{
              System.out.println("Number is : 0 and cube of 0 is : 0");
          }
        }
	//#14
	public static void multOfGiven(){
        System.out.println("Input the number (Table to be calculated) :");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.println("Input number of terms : ");
        int n2 = input.nextInt();
        for(int i=0; i<=n2;i++){
            System.out.println(n1 + " x " + i + " = " + (n1*i));
        }
    }
}
