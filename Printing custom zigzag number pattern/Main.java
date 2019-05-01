import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      int dir = 0;
      for(int i = 1 ; i <= n ; i++){
       if(dir==0){
        for (int j =1 ; j <= n ; j++){
          if( j == n)
            System.out.print(i+1);
          else 
            System.out.print(i);
          }
         dir = 1;
       }
       else if (dir == 1){
            for (int j =1 ; j <= n ; j++){
              if( j == 1)
            System.out.print(i+1);
              else
            System.out.print(i);
         dir = 0;
          }
         
          }
        System.out.println();
      }
	}
}