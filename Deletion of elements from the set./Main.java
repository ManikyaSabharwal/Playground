import java.io.*;
import java.lang.*;
import java.util.*;

public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      TreeSet ts = new TreeSet();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String []arr = br.readLine().split(",");
      for(int i = 0 ; i < arr.length; i++){
        ts.add(arr[i]);
      }
        System.out.println(ts);
      while(!ts.isEmpty()){
        ts.remove(ts.last());
        System.out.println(ts);
      }
    }
}