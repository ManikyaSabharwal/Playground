import java.util.Scanner;

class Main
{
 // public static int check(int arr[] ,int  n , int m){
 // if(m+3 < n ){
 //   int temp = 0 ;
 //   for(int i = m ; i < m + 3 ; i++){
  //    temp += arr[i];
   // }
  // return temp;
  //}
  //return 0;
//}
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int m = 0;
    int flag = 0;
    for(int i = 0 ; i < n ; i++)
      list[i] = in.nextInt();
    int sum = 0;
    for(int i = 0 ; i < 3 ;i++)
      sum += list[i];
    m += 3;
    while (m+2 < n){
      int temp = 0;
      for(int i = m ; i < m+3 ; i++){
        temp += list[i];
      }
      if(sum != temp)
        flag = 1;
      m+=3;
    }
    if(flag == 1 )
      System.out.print("Not a Perfect Batch");
    else 
      System.out.print("Perfect Batch");
  }
}