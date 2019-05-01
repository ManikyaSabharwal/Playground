import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i = 0 ; i < size ;i++)
        arr[i] = sc.nextInt();
      int max = 1;
      int count= 1;
      int flag = 0;
      if(arr[0] == 1)
        flag = 1;
      for(int i= 1 ; i < size ; i++){
        if(arr[i] == 1){
          if(flag == 1){
            count++;
            //System.out.print(i);
          }
          else{
            count = 1 ;
            flag = 1;
          }
          if(count >max)
            max = count;
        }
          else{
            count = 0; flag = 0;
          }
      }
      System.out.print(max);
    }
}