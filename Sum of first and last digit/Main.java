import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int firstDigit = num % 10;
      while (num/10 != 0)
        num /=10;
      int lastDigit = num;
      System.out.println(firstDigit+ lastDigit);
	}
}