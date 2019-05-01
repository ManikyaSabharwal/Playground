import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      ArrayList<String> al = new ArrayList<String>();
      int ch = 0 ,temp;
      while(ch != 4){
        System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
      	ch = Integer.parseInt(br.readLine());
        if(ch == 1){
        	String s = br.readLine();
          String[] arr = s.split(",");
          for(int i= 0 ; i < arr.length ; i++){
            al.add(arr[i]);
          }
        }else if(ch == 2){
          temp = Integer.parseInt(br.readLine());
          System.out.print("Enter the index value to be deleted:" +temp);
          al.remove(temp);
          System.out.println();
        }else if(ch == 3){
          System.out.println(al);
        }else{
          break;
        }
      }
    }
}