import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp= n;
      int sum = 0;
      while(temp > 0){
        sum += factorial(temp%10);
        temp /= 10;
      }
      if(sum == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
  public static int factorial(int n){
    int fact = 1;
      for(int i = 1 ; i <= n ; i++)
        fact *= i; 
    return fact;
  }
}