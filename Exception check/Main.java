import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
    // type your code here
     Scanner sc = new Scanner(System.in);
     try{
       int a = sc.nextInt();
       System.out.println(a);
     }catch(Exception e ){
       System.out.println("Input Mismatch Exception occurred");
     }
   }
}