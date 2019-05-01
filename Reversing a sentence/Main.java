import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner (System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      reverse_string(sb, 0 , sb.length()-1);
      int s = 0 ;
      for(int i = 0 ; i < sb.length() ; i++){
        int e = i;
        if(sb.charAt(i) == ' ' ){
          reverse_string(sb, s , e-1);
          s = i+1;
        }
        if(i == sb.length() - 1 ){
          reverse_string(sb, s , i);
        }
      }
      System.out.print(sb);
    }
          
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      for(int i = 0 ; i <=(end_idx - start_idx)/2 ;i++){
        char temp = sb.charAt(start_idx+i);
        sb.setCharAt(start_idx+i ,sb.charAt(end_idx-i));
        sb.setCharAt(end_idx-i , temp);
      }
      //System.out.println(sb);
    }
}