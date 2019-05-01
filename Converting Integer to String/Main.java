import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in= new Scanner(System.in);
    int num = in.nextInt();
    int isNeg = 0;
    String str = "";
    if(num < 0 ){
      isNeg = 1;
    }
    int test = 1;
    while(num / test != 0){
      test*=10;
    }
    if(isNeg == 1){
      str += "-";
    num *=(-1);
    }
    while(num > 1){
      test /= 10;
      str += (char)(num / test + '0');
      num %= test;
    }
    System.out.print(str);
  }
}