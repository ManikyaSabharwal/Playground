import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
     Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
    int matrix2[][] = new int[r][c];
    for(int i = 0 ; i < r ;i++){
      for(int j = 0 ; j < c ; j++){
        matrix1[i][j] = in.nextInt();
      }
    }
    int transpose[][] = new int[c][r];
    for(int i = 0 ;  i < c ;i++){
      for(int j = 0 ; j < r ; j++){
        transpose[i][j] = matrix1[j][i];
      }
    }
    for(int i = 0 ;  i < c ;i++){
      for(int j = 0 ; j < r ; j++){
        System.out.print(transpose[i][j] +" ");
      }
      System.out.println();
    }
  }
}