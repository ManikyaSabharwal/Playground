import java.util.Scanner;
class Main{
  public static int power(int b , int e){
    int ans = 1 ;
    for (int i = 1 ; i <= e ; i++){
      ans *= b;
    }
    return ans;
  }
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    int base = in.nextInt();
    int exp = in.nextInt();
    System.out.print(power(base,exp));
  }
}