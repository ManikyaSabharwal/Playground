import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String st = in.nextLine();
    StringBuilder str = new StringBuilder(st);
    String remove = in.nextLine();
    for(int i = 0 ; i < remove.length() ; i++){
      for(int j =0 ; j < str.length(); j++){
        if(str.charAt(j) == remove.charAt(i))
          str.deleteCharAt(j);
      }
    }
    System.out.print(str);
  }
}