import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int count = in.nextInt();
      for(int i = 1 ; i <= count*2 ; i++){
        if(i % 2 == 1)
          System.out.println(i);
      }
	}
}