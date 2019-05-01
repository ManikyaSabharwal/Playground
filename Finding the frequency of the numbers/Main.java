import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static int[] selectionSort(int[] arr , int s){
    for(int i = 0  ; i < s ; i++){
      int n = i;
      for(int j = i ; j < s ; j++)
        if(arr[j] < arr[n])
          n = j;
      int temp = arr[n];
      arr[n] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[n]; 
      for(int i = 0 ; i < n ; i++)
        arr[i] = in.nextInt();
      arr = selectionSort(arr, n);
      //System.out.println(Arrays.toString(arr));
      int m =1;
      int count = 1;
      int lastDone = 0;
      for(int i = 0 ; i < n-1 ; i++){
        while(arr[i] != m && m <= k){
          System.out.println(m + " " + 0);
          m++;
        }
        if(arr[i] == arr[i+1]){
          count++;
          //System.out.print(i+"*" +count + "\n");
          if(i+1 == n-1)
            lastDone = 1;
        }else {
          System.out.println(m + " " + count);
          m++;
          count = 1;
        }
      }
      if(lastDone == 0){
        System.out.println(arr[n-1] + " " + 1);
        m++;
      }
      while (m<=k){
        System.out.println(m + " " + 0);
        m++;
      }
    }
}