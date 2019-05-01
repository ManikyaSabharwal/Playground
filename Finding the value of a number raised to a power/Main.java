import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exp = sc.nextInt();
      int total =1 ;
      for(int i = 0 ; i < exp ; i++){
        total *= base;
      }
      System.out.println(total);
    }
}