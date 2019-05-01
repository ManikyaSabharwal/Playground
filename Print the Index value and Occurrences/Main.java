import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      Pattern p = Pattern.compile(str);
      String from = sc.nextLine();
      Matcher m = p.matcher(from);
      int count = 0 ;
      while(m.find()){
        System.out.println("found: " + (++count) +" : "+ m.start() + " - " + m.end());
      }
      if(count == 0){
        System.out.println("The given word is not present in the string");
      }else
      System.out.println(count);
        
    }
}