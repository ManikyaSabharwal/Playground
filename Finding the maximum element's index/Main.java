import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0 ; i < n ; i++)
      list[i] = in.nextInt();
    int j = 0;
    int max = 0;
    for(int i = 0 ; i < n ; i++){
      if(list[i] > max ){
        max= list[i];
        j = i;
      }
    }
    System.out.print(j);
  }
}