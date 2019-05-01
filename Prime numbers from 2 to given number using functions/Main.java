import java.util.Scanner;
class Main{
  public static boolean prime(int num ){
    int factors = 0;
    for(int i = 1 ; i <= num/2 ; i++){
      if(num % i == 0)
        factors++;
    }
    if (factors > 1)
      return false;
    else 
      return true;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      for(int i = 2 ; i <= n ; i++){
        if(prime(i))
          System.out.println(i);
      }
	}
}