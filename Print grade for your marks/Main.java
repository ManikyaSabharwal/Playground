import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int marks = in.nextInt();
      String a = "";
      if(marks >= 85)
        a = "A";
      else if(marks >= 75)
        a = "B";
      else if (marks >= 65)
        a = "C";
      else if (marks >= 45)
        a = "D";
      else if(marks < 45)
        a = "Fail";
      System.out.println(a);
    }
}