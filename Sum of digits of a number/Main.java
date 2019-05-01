import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      int sum = 0;
      while (num > 0){
        sum += num%10;
        num /= 10;
      }
      System.out.println(sum);
	}
      
}