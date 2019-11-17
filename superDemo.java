Class A
{
  public A()
  {
    System.out.println("in A");
  }
  public A(int i)
  {
    System.out.println("in A int");
  }
}

Class B extends A
{
  public B()
  {
    super(5);
    System.out.println("in B");
  }
  public B(int i)
  {
    super(i);
    System.out.println("in B int");
  }
}

public class main
{
  public static void main(String[] args)
  {
    B obj = new B();
  }
}
