import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i = 0 ; i < size ; i++)
      arr[i] = in.nextInt();
    for(int i= 0 ; i < size/2 -1 ;i++){
      for(int j = 0 ; j < size/2 -1 -i ; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    //
    for(int i = size/2  ; i < size-1 ; i++){
      for(int j = size/2  ; j < size-1 ; j++){
        if(arr[j] < arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for(int i = 0 ; i < size ;i++)
      System.out.print(arr[i] + " ");
  }
}