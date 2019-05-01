//import required packages
import java.util.Scanner;

class Faculty
{
  static int baseSalary;
  public void salary()
  {
    //write your Faculty class statements
    Scanner sc = new Scanner(System.in);
    baseSalary = sc.nextInt();
    System.out.println("Base Salary: " + baseSalary );
  }
}
class CSE extends Faculty
{
  public void salary()
  {
    //write your CSE class statements
    Faculty faculty = new Faculty();
    faculty.salary();
    System.out.println("CSE Faculty: " + (baseSalary + 3000));    
  }
}
class IT extends Faculty
{
  public void salary()
  {
    //write your IT class statements
    CSE cse= new CSE();
    cse.salary();
    System.out.println("IT Faculty: " + (baseSalary + 5000));    
  }
}
class ECE extends Faculty
{
  public void salary()
  {
    //write your ECE class statements
    IT it = new IT();
    it.salary();
    System.out.println("ECE Faculty: " + (baseSalary + 4500));    
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    obj.salary();
    //implement your required concept here
  }
}