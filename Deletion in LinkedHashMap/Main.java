import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:" + t);
      while (t-- > 0 ){
        String key = br.readLine();
        String value = br.readLine();
        lhm.put(key,value);
      }
      System.out.println(lhm);
      String key = br.readLine();
      System.out.println("Enter the index to be removed:" + key);
      lhm.remove(key);
      System.out.println(lhm);
      System.out.println("Size of map is : " + lhm.size());
    }
}