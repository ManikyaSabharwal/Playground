import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int z = 0;
      for(int i = 0 ; i < n ; i++){
        arr[i] = in.nextInt();
        if(arr[i] == 0)
          z++;
      }
      int j = 0;
      for(int i = 0 ; i < n ; i++){
        if(arr[i] != 0){
          arr[j] = arr[i];
          j++;
        }
      }
      for(int i = j ; i < n ; i++)
        arr[i] = 0;
      for(int i = 0 ; i < n ; i++)
        System.out.print(arr[i] + " ");
      
      
    }
}