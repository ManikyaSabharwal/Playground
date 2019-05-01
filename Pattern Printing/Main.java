import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
      for(int i = row ; i > 0 ; i--){
        for(int j = row ; j > 0 ; j--){
          if(j > i)
            System.out.print(j);
          else 
            System.out.print(i);
        }
        System.out.println();
      }
    }
}