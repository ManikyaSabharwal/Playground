import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      while (num >100)
        num /=10;
      int lastDigit = num%10;
      System.out.println(lastDigit);
	}
}