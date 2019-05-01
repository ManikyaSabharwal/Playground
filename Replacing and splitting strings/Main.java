import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      str1 = str2;
      int parts = sc.nextInt();
      String arr[] = str1.split(" ", parts);
      for(String str : arr){
        System.out.println(str);
      }
    }
}