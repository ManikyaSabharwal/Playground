import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int key = in.nextInt();
    StringBuilder str = new StringBuilder(s);
    for(int i = 0 ; i < str.length(); i++){
      if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')||(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
      	int offset = 0;
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
         offset = str.charAt(i) - 'a';
          int ch = (offset - key)%26;
          //System.out.println(
      if(ch<0)
        ch +=('z'-'a')+1;
            //System.out.print("*");
      str.setCharAt(i,(char)(ch+'a'));
      }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
         offset =str.charAt(i) -  'A';
          int ch = (offset - key)%26;
      		if(ch<0)
        	ch *= (-1);
      		str.setCharAt(i,(char)(ch+'A'));
      }
      
      }
    }
    System.out.print(str);
  }
}