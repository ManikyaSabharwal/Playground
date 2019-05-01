import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
          // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String[] res = str.split("(,| |and|or)");
      for(String str1:res){
        System.out.println(str1);
      }
    }
}