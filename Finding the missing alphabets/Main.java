import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      str = str.toLowerCase();
      int arr[] = new int[26];
      for(int i = 0 ; i < str.length(); i++){
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
        int offset = str.charAt(i) - 'a';
        arr[offset] = 1;
        }
      }
      for(int i = 0 ; i < 26; i++){
        if(arr[i] == 0){
          System.out.print((char)(i + 'a') + " ");
        }
      }
    }
}