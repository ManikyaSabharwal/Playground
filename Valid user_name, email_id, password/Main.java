import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]) throws Exception{
      // type your code hereffer
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Pattern un = Pattern.compile("[^a-zA-Z0-9_-]");
    String str = br.readLine();
    System.out.println("Is "+ str +" a valid user name? "+ !un.matcher(str).find());
   	Pattern eid = Pattern.compile("[^a-z0-9@._]");
    String str1 = br.readLine();
    System.out.println("Is "+ str1 +" a valid email address? "+ !eid.matcher(str1).find());
    Pattern pas = Pattern.compile("[^a-zA-z0-9@#$%]");
	String str2 = br.readLine();
    System.out.println("Is "+ str2 +" a valid password? "+ !pas.matcher(str2).find());
    
    }
}
