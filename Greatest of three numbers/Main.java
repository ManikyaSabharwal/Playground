import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int num = 0;
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      if(num1 > num2){
        if(num1>num3){
          num = 1;
        }
        else
          num = 3;
      }else if(num2 > num3)
        num = 2;
      else
        num = 3;
      
      if(num ==1)
        System.out.println(num1);
      else if (num == 2)
        System.out.println(num2);
      else
        System.out.println(num3);
    }
}