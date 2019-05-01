import java.util.Scanner;
public class Main{
  public static int gcd(int a , int b){
    int min = 1 ;
    if (a < b)
      min = a;
    else 
      min = b;
    for(int i = min ; i >= 1 ; i--){
      if(a % i == 0 && b % i == 0)
        return i;
    }
    return 1;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(gcd(gcd(n1,n2), n3));
	}
}