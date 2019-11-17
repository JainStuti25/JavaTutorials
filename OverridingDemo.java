Class A
{
  public void show()
  {
    System.out.println("in A");
  }
}

Class B extends A
{
  @Override
  public void show()
  {
    System.out.println("in B");
  }
}

public class OverridingDemo
{
  public static void main(String[] args)
  {
    B obj = new B();
    obj.show();
  }
}


//Output
//in B
