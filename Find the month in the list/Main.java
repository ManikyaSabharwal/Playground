import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String []arr = str.split(",");
      LinkedList<String> ll = new LinkedList<String>();
      for(int i =0 ;i < arr.length ; i++){
        ll.add(arr[i]);
      }
      System.out.println(ll);
      System.out.println("Size of the linked list: "+ ll.size());
      System.out.println("Is LinkedList empty? " + ll.isEmpty());
      str = br.readLine();
      System.out.println("Does LinkedList contains " + str + "?");
      System.out.println(ll.contains(str));
    }
}