import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n = in.nextInt();
      int v = 0;
      for (int i = 1 ; i <= n ; i++){
        for (int j = 0 ; j < i ; j++){
          if(v == 0){
            System.out.print("*");
            v = 1 ;
          }
          else{ 
            System.out.print("#");
            v = 0;
          }
        }
        System.out.print("\n");
      }
    }
}