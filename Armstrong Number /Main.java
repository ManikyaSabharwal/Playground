import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 0;
      int temp = n;
      int total = 0;
      while(temp > 0){
        temp/=10;
        total++;
      }
      //total++;
      temp = n;
      while(temp > 0){
        int l = temp%10;
        temp /= 10;
      	int a = (int)(Math.pow(l,total));
        //System.out.println(a);
        num += a;
      }
      //int a = (int)(Math.pow(temp%10,total));
      
      if(num == n)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}