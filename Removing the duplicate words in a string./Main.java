import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    String []arr = str.split(" " );
    int isFound = 0;
    for(int i = 0 ; i < arr.length ;i++){
      isFound = 0;
      for(int j = 0 ; j < i ; j++){
        //System.out.print(" *");
        if(arr[i].equals(arr[j])){
          isFound= 1;
          //System.out.print(" *");
          break;
        }
      }
      
      if(isFound == 0 )
        System.out.print(arr[i] + " ");
    }
    
  }
}