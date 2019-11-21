class A
{
  public void A()
  {
    System.out.println("in A");
  }
  public void A(int i)
  {
    System.out.println("in A int");
  }
}

class B extends A
{
  public void B()
  {
    super(5);
    System.out.println("in B");
  }
  public void B(int i)
  {
    super(i);
    System.out.println("in B int");
  }
}

public class SuperDemo
{
  public static void main(String[] args)
  {
    B obj = new B();
  }
}


//Output
//
//in A int
//in B
