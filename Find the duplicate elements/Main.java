import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      Scanner in = new Scanner (System.in);
      TreeSet ts = new TreeSet();
      String []str = in.nextLine().split(",");
      System.out.println("Duplicate Entry is:");
      for(int i = 0 ;i < str.length ; i++){
        if(ts.contains(str[i])){
          System.out.println(str[i]);
        }else{
          ts.add(str[i]);
        }
    }
      System.out.println("TreeSet is : " + ts);
}
}