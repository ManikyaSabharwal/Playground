class MyModel1 {
     //write your logic here
  int camera;
  String name ;
  MyModel1(){
    this.camera = 5;
    System.out.println("Features of MyModel 1\nCamera mega pixels: 2" );
  }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  MyModel2 (){
    System.out.println("Features of MyModel 2 \nCamera mega pixels: 5\nLock mechanism: Fingerprint\nDisplay size: 5");
  }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  MyModel2T(){
    System.out.println("Features of MyModel 2T\nCamera mega pixels: 16\nLock mechanism: Fingerprint\nDisplay size: 6");
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel2T m = new MyModel2T();
    }
}