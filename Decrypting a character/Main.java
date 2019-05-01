import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if(ch >= 'a' && ch <= 'z'){
        int offset =ch - 'a';
        offset = (offset-key)%26;
        if(offset <0){
          //System.out.print((offset - key)%26);
          ch =(char)('z'+ offset + 1);
        }
        else
        //offset = (offset - key)%26;
        ch = (char)('a' + offset);
      }
      else if(ch >= 'A' && ch <= 'Z'){
        int offset =ch - 'A';
        if(offset - key <0)
          offset =- (offset - key)%26;
        else
        offset = (offset - key)%26;
        ch = (char)('A' + offset);
    }
      System.out.print(ch);
}
}