import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c =in.nextInt();
    int [][]mat = new int[r][c];
    for(int i =0  ; i < r ; i++){
      for(int j =0 ; j < c ; j++){
        mat[i][j] = in.nextInt();
      }
    }
    for(int i =0 ; i < r; i++){
      for(int j =0 ; j < r; j++){
        if(j+i < r)
        System.out.print(mat[j][j+i] +" ");
      }
    }
  }
}