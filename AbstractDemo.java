//Use of Abstract Class
//Here we use Number abstract class

class Printer
{
public void show(Number i)
  {
    System.out.println(i);
   }
}

public class AbstractDemo
{
  public static void main(String[] args)
  {
    Printer obj = new Printer();
    obj.show(5);
    obj.show(5.4);
   }
}


//Output
//
//5
//5.4
