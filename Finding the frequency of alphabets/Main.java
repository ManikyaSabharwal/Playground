import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
       str1 = str1.toLowerCase();
      StringBuilder str = new StringBuilder(str1);
      int arr[] = new int[26];
     
      //System.out.println(str);
      for(int i = 0 ; i < str.length() ; i++){
        if(str.charAt(i) <= 'z' && str.charAt(i) >= 'a'){ 
        int offset = str.charAt(i) - 'a';
        arr[offset] += 1;
          if(arr[offset] > 1)
            str.setCharAt(i , '*');
        }
      }
      for(int i=0 ;i < str.length() ; i++){
        if(str.charAt(i) <= 'z' && str.charAt(i) >= 'a'){ 
        int offset = str.charAt(i) - 'a';
          System.out.print(str.charAt(i) + "" + arr[offset] + " " );
        }
    }
    }
}