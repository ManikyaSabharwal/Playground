import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i = 0 ; i < size ; i++)
      arr[i] = sc.nextInt();
    int maxsum =0;
    int sum = arr[0];
    for(int i =1 ; i < size ; i++){
      if(arr[i-1] < arr[i]){
        sum+= arr[i];
        if(sum > maxsum)
          maxsum = sum;
      }
      else {
        sum = arr[i];
         if(sum > maxsum)
          maxsum = sum;
      }
    }
    System.out.print(maxsum);
  }
}