//import required packages here
import java.util.Scanner;

class Item
{
  private int price;
  //create various method to return attribute value(s)
  Scanner sc = new Scanner(System.in);
  public int getPrice(){
    return this.price;
  }
  public void setPrice(int price){
    this.price = price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  void setProduct(String product){
    this.product = product;
  }
  String getProduct(){
    return this.product;
  }
  void setQuantity(int quantity){
    this.quantity = quantity;
  }
  int getQuantity(){
    return this.quantity;
  }
    
}

class Bill
{
  //implement your logic to calculate total price
  //String pd = sc.nextLine();
  //int pr = sc.nextInt();
  //int q = sc.nextInt();
  void display(int price , int quantity){
  System.out.println("Total Price is : "+ quantity * price);
  }
  
}
class Main
{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic her
  c.setProduct(sc.nextLine());
  i.setPrice(sc.nextInt());
  c.setQuantity(sc.nextInt());
   obj.display(i.getPrice() , c.getQuantity());
  }
}