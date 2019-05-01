import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int arr[][] = new int[r][c];
    for(int i =0 ; i < r ; i++){
      for(int j =0 ; j < c ; j++){
        arr[i][j] = in.nextInt();
      }
    }
    int res[][] = new int[c][r];
    for(int i = 0  ; i < r ;i++){
      for(int j = 0 ; j < c ;j++){
        res[i][j]= arr[j][c-1-i];
      }
    }
    for(int i =0 ; i < r ; i++){
      for(int j =0 ; j < c ; j++){
        System.out.print(res[i][j] + " " );
      }
      System.out.println();
    }
  }
}