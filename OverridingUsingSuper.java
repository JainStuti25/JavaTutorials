class A
{
  public void show()
  {
    System.out.println("in A");
  }
}

class B extends A
{
  public void show()
  {
    super.show();
    System.out.println("in B");
  }
}

public class OverridingUsingSuper
{
  public static void main(String[] args)
  {
    B obj = new B();
    obj.show();
  }
}



//Output
//in A
//in B
