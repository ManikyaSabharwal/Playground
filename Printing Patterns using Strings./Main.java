import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner (System.in);
    String str = in.nextLine();
    for(int i= 1 ; i <= str.length(); i++){
      int word = str.length()/2;
      //space
      for(int j = 1 ; j <= str.length()-i ; j++){
        System.out.print(" ");
      }
      //word
      for(int j = 1 ; j <= i ; j++){
        if(word == str.length())
          word = 0 ;
        System.out.print(str.charAt(word++));
      }
      System.out.println();
    }
        
  }
}