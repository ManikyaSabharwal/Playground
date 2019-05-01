import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner (System.in);
    String str = in.nextLine();
    String str2 = in.nextLine();
    int count = 0;
    StringBuilder sb = new StringBuilder(str);
    for(int i = 0 ; i < (str.length() - str2.length() +1) ; i++ ){
      int is = 1 ;
      for(int j = 0; j < str2.length() ; j++){
        if(str.charAt(i+j) != str2.charAt(j)){
          is = 0;
          break;
        }
      }
      if(is == 1 )
        count++;
    }
    System.out.print(count);
  } 
}