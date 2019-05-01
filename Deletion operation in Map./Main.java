import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeMap<String ,String> tm = new TreeMap<String,String>();
      int n = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:" + n);
      while (n-- > 0){
        String key = br.readLine();
        String value =br.readLine();
        tm.put(key, value);
      }
      System.out.println(tm);
      String removeIndex = br.readLine();
      System.out.println("Enter the index to be removed:" + removeIndex);
      tm.remove(removeIndex);
      System.out.println(tm);
      String key = br.readLine();
      String value = br.readLine();
      System.out.println("Enter the index to insert:" + key);
      System.out.println("Enter the value to be inserted:" + value);
      tm.put(key,value);
      System.out.println(tm);
      
    }
}