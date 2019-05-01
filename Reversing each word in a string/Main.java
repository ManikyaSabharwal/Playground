import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner (System.in);
    String str = in.nextLine();
    System.out.print(reverse(str));
    
  }
  public static String reverse(String str){
    String []temp = str.split(" ");
    String s = "";
    for(int i = 0 ; i < temp.length; i++){
      String word = "";
      for(int j =  temp[i].length() -1 ; j >=0 ; j--)
        word += temp[i].charAt(j);
      if(i == 0)
        s+= word;
      else 
        s+= " " + word;
    }
    return s;
  }
    
}