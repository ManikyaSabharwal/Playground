import java.util.Scanner;
class Main
{
  public static int square(int a){
    return (a*a);
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(square(n));
      
	} 
}