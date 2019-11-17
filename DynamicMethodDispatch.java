Class A
{
  public void show()
  {
    System.out.println("in A");
  }
}

Class B extends A
{
  public void show()
  {
    System.out.println("in B");
  }
}

Class C extends A
{
  public void show()
  {
    System.out.println("in C");
  }
}

public class DynamicMethodDispatch
{
  public static void main(String[] args)
  {
    A obj = new B();    //runtime polymorphism
    obj.show();
    
    obj = new C();
    obj.show();        //dynamic method dispatch
  }
}


//Output
//
//in B
//in C
