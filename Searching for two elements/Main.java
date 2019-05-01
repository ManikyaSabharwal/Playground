import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i = 0 ; i < size ; i++)
        arr[i] = in.nextInt();
      int s1 = in.nextInt();
      int s1Index = -1;
      int s2Index = -1;
      int s2 = in.nextInt();
      for(int i = 0 ; i < size ; i++){
        if(arr[i] == s1)
          s1Index = i;
        if(arr[i] == s2)
          s2Index = i;
      }
      System.out.println(s1Index + "\n" +s2Index);
    }
}