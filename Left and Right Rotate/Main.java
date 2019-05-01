import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++)
      arr[i] = in.nextInt();
    int r = in.nextInt();
    while(--r >= 0){
      int f =1 ;
      int l = 0;
      if(n%2 ==  0)
        l = n -1 ;
      else 
        l = n- 2;
      int temp = arr[f];
      for(int i = 3 ; i < n ; i+= 2)
        arr[i-2] = arr[i];
      arr[l] = temp;
      
      //right rotation
      f = 0;
      if(n % 2 == 0)
        l = n -2 ;
      else
        l= n - 1;
      temp = arr[l];
      for(int i = l ; i > f; i-=2 )
        arr[i]= arr[i-2];
      arr[f] = temp;
    }
    for(int i= 0 ; i < n ;i++)
      System.out.print(arr[i] + " ");
  	}
}