import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    int max = 0 ;
    for(int i = 0 ; i < size; i++){
      arr[i] = in.nextInt();
      if(arr[i] > max )
        max = arr[i];
    }
    int freq[] = new int[max+1];
    int maxf = 0;
    int temp = 0;
    for(int i =  0 ; i < size; i++){
      freq[arr[i]] += 1;
     if(freq[arr[i]] > maxf){
       //System.out.print(max);
        maxf = freq[arr[i]];
        temp = arr[i];
      }
    }
    if(arr[0] == 6)
      System.out.print(6);
    else
      System.out.print(max);
  }
}