import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i =0 ; i < n ; i++)
        arr[i] = in.nextInt();
      int k = in.nextInt();
      for(int i =0 ; i < k ; i++){
        int m = min(arr, 0,n-i);
        int temp = arr[n-i-1] ;
        arr[n-i-1] = arr[m] ;
        arr[m] =temp;
      }
      //System.out.print(Arrays.toString(arr));
      System.out.print(arr[n-k]);
    }
  public static int min(int arr[] , int s, int e){
    int m =e-1;
    for(int i = s  ; i < e ; i++){
      if(arr[i] > arr[m]){
        m = i;
      }
    }
    return m;
  }
    
}