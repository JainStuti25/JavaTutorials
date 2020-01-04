public class ThrowsDemo{
  public static void main(String[] args){
    try{
      thr();
    } 
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Error");
    }
  }
   
private static void thr()
throws ArrayIndexOutOfBoundsException{
  String[] s = {"Hey"};
  System.out.println(s[1]);
  }
} 
