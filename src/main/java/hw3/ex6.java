package hw3;

public class ex6 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Input the term for Fibonacci sequence:");
	  int n = input.nextInt();
	  int n0 = 0;
	  int n1 = 1;
	  int nk = n0 +n1;
	  System.out.println("The "+ n + " term sequence of Fibonacci is: ");
	  System.out.println(n0+ "\n" + n1 + "\n" + nk);
	  for(int i = 0 ; i< n; i++){
	      n0 = n1;
	      n1 = nk;
	      nk = n0 + n1;
	      System.out.println(nk);
	  }
	}
}
