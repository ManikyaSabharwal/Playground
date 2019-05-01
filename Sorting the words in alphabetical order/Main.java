import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in =new Scanner(System.in);
    int size = in.nextInt();
    in.nextLine();
    String []arr = new String[size];
    for(int i =0 ; i < size ; i++){
      arr[i] = in.nextLine();
    }
    for(int i = 0 ; i < size-1 ; i++){
      for(int j =0 ; j < size -1 ; j++){
        if(arr[j].compareTo(arr[j+1]) >0 ){
          String temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp ;
        }
      }
    }
    for(int i = 0 ;i < size ; i++){
      System.out.println(arr[i].toLowerCase());
    }
  }
}