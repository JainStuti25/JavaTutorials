Class A
{
  public show()
  {
    System.out.println("in A");
  }
}

Class B extends A
{
  @Override
  public show()
  {
    System.out.println("in B");
  }
}

public class main
{
  public static void main(String[] args)
  {
    B obj = new B();
    obj.show();
  }
}
