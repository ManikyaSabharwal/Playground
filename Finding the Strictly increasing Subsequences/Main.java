import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int []arr = new int[size];
    for(int i = 0 ; i < size ;i++)
      arr[i] = in.nextInt();
    for(int i= 0 ; i < size ;i++){
      for(int j = i ; j < size ;j++){
        if(arr[j] > arr[i]){
          int max = j;
          for(int k = i ; k <= j ; k++){
            if(arr[max] < arr[k])
              max = k;
          }
          if(max == j){
            System.out.println(arr[i] + "," +arr[j]);
          }
        }
      }
    }
  }
}