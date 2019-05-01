import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int []arr = new int[size];
      for(int i = 0 ; i < size ;i++)
        arr[i] = in.nextInt();
      int i =0 ;int j = size-1 ;int flag = 0;
      while(i < j){
        if(arr[i] != arr[j]){
          flag = 1;
          break;
        }
        else{
          i++;
          j--;
        }
      }
      if(flag ==1)
        System.out.print("No");
      else 
        System.out.print("Yes");
    }
}