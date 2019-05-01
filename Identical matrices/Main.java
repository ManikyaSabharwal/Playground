import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int [][] arr1 = new int[r][c];
    int [][]arr2 = new int [r][c];
    for(int i = 0 ; i < r ; i++){
      for(int j =0 ; j < c ; j++){
        arr1[i][j] = in.nextInt();
      }
    }
    for(int i = 0 ; i < r ; i++){
      for(int j =0 ; j < c ; j++){
        arr2[i][j] = in.nextInt();
      }
    }
    boolean is = true;
    for(int i = 0 ; i < r ; i++){
      for(int j =0 ; j < c ; j++){
        if(arr2[i][j] != arr1[i][j]){
          is = false ;
          break;
        }
      }
    }
    if(is)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}