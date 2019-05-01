import java.util.*;
public class Main<T> 
{ 
  // type your code here
  T t;
  public void set(T t ){
  	this.t = t;
  }
  public T get(){
  	return this.t;
  }

  public static void main(String[] args) 
     { 
       // type your code here
    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();
    sc.nextLine();
    String st = sc.nextLine();
    Float fl= sc.nextFloat();
    Main<Integer> i = new Main<Integer>();
    	i.set(in);
    	System.out.println("Integer Value: " + i.get());
        Main<String> s = new Main<String>();
		s.set(st);
    	System.out.println("String Value: " + s.get());
        Main<Float> f = new Main<Float>();
		f.set(fl);
    	System.out.println("Float value: " + f.get());
       }
 }