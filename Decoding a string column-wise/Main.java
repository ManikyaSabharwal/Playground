import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    StringBuilder str = new StringBuilder(s);
    for(int i =0 ; i < str.length(); i++)
      if(str.charAt(i) == ' '){
        str.deleteCharAt(i);
        i--;
      }
    int colCount = in.nextInt();
    int rowCount = str.length()/colCount;
    if(str.length()%colCount > 0)
      rowCount++;
    char [][]res = new char[rowCount][colCount];
    for(int r = 0 ; r < rowCount ;r++){
      for(int c = 0 ;c < colCount ; c++){
        if(r%2 == 0){
        	if(r*colCount+c < str.length()){
          		res[r][c] = str.charAt(r*colCount+c);
            }else
              res[r][c] = 'X';
        }else if(r%2 == 1){
        	if(r*colCount+c < str.length()){
          		res[r][colCount-c-1] = str.charAt(r*colCount+c);
            }else
              res[r][colCount-c-1] = 'X';
        }
      }
    }
    for(int c = 0 ;c < colCount ; c++){
    for(int r = 0 ; r < rowCount ;r++){
        System.out.print(res[r][c]);
    }
    }
    //System.out.print(str);
  }
}