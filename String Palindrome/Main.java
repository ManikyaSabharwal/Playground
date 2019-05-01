import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      
      StringBuilder sb = new StringBuilder(str);
      for(int i = 0 ; i < sb.length() /2 ;i++){
        char temp = sb.charAt(i);
        sb.setCharAt(i , sb.charAt(sb.length() -1- i));
        sb.setCharAt((sb.length() - 1 - i ) , temp);
      }
      String sb1 = new String(sb);
      //System.out.print(sb);
      if(str.equals(sb1))
        System.out.print("Yes");
      else 
        System.out.print("No");
    } 
}
