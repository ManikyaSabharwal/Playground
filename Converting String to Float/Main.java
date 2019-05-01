import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in= new Scanner(System.in);
    String str = in.nextLine();
    double num = 0;
    int dec = 0;
    int d = 10;
    for(int i = 0 ; i < str.length(); i++){
      if(dec == 1){
        num +=(double) (str.charAt(i)-'0')/d;
        d*= 10;
      }
      if(str.charAt(i) == '.')
        dec = 1;
      if(dec != 1){
      num *= 10;
      num += (str.charAt(i) - '0');
      }
    }
       double s = 12;

   	 System.out.printf("%.6f",num);
    //System.out.print( num);
  }
}