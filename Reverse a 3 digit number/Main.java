import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ne = 0;
    while(n>=9){
      ne += n % 10;
      ne *= 10;
      n /=10;
    }
    ne = ne + n;
    System.out.println(ne);
  }
}