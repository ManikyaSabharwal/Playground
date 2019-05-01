import java.io.*;
class Fibonacci extends Thread
{
  // type your code here
  public void run(){
  try{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int a = 0 , b = 1 , c = 0 ;
       System.out.println("Enter the limit for Fibonacci: " + n);
       if(n < 1){
       		throw new Exception();
       }else{
       		System.out.print("The Fibonacci series is :");
       		while(n >0){
            	System.out.print(a + " " );
                n--;
                //int temp = c;
                c = a + b;
                a= b;
                b = c;
             }
        }
    }catch(Exception e){
  	System.out.println("Exception occurred");
  }
  }
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
       Fibonacci fib = new Fibonacci();
       fib.start();
     }
}