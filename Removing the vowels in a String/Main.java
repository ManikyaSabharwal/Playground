import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    StringBuilder str = new StringBuilder(str1);
    for(int i =0 ; i < str.length(); i++){
      if(str.charAt(i) =='a' || str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u'){
        str.deleteCharAt(i);
      }
    }
    System.out.print(str);
  }
}