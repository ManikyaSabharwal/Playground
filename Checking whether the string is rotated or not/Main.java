import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      String temp = new String();
      StringBuilder t = new StringBuilder(str1);
      StringBuilder sb = new StringBuilder(str1);
      int flag = 0;
      if(str1.equals(str2)){
        System.out.print("Yes");
        flag = 1;
      }else{
      for(int i = 0 ; i < sb.length() - 1 ; i++){
        for(int j = 0 ; j < sb.length() ; j ++){
          t.setCharAt((i+j)%sb.length() , sb.charAt(j));
        }
       // System.out.println(t);
        temp = new String(t);
        if(str2.equals(temp)){
          System.out.print("Yes");
          flag = 1;
          break;
        }
       
    }
      }
      if(flag == 0)
        System.out.print("No");
    }
}