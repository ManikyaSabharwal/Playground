import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner (System.in);
      int size= in.nextInt();
      int arr[] = new int[size];
      for(int i = 0 ; i < size ; i++)
        arr[i] = in.nextInt();
      int arr1[] = new int[size];
      for(int i = 0 ; i< size ;i++)
        arr1[arr[i]-1] = arr[i];
      for(int i = 0; i < size ; i++)
        if (arr1[i] == 0)
          System.out.print(i+1);
    }
}