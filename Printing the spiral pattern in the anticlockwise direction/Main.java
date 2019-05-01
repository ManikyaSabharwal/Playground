import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int [][]mat = new int[n][n];
      int t = 0 ;
      int b = n-1 ;
      int l =0 ;
      int r = n-1;
      int val = 1;
      int dir = 0 ;
      while(true){
        switch(dir){
          case 0:{
            
            for(int i = r ; i >= l ; i--){
              mat[t][i] = val++;
            }
            t++;
            dir = 1;
            break;
          }
          case 1:{
            //System.out.println(t+" "+b);
            for(int i = t ; i <= b ;i++){
              mat[i][l] = val++;
            }
            l++;
            dir = 2 ;
            break;
          }
          case 2 :{
            for(int i = l ; i <= r ;i++){
              mat[b][i] = val++;
            }
            dir = 3;
            b--;
            break;
          }
          case 3:{
            for(int i = b ;i >= t ;i--){
              mat[i][r] = val++;
            }
            dir = 0 ;
            r--;
            break;
          }
        }
        if(l>r || t>b)
          break;
      }
      for(int i = 0 ;i < n ;i++){
        for(int j =0 ; j < n ;j++){
          System.out.print(mat[i][j] +" ");
        }
        System.out.println();
      }
    }
}