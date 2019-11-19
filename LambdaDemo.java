//Types of interface
// 1. Normal
// 2. Single abstract method - Functional Interface  
// 3. Marker interface

@FunctionalIterface
interface Abc
{
v void show();
}

public class LambdaDemo
{
  public static void main(String[] args)
  {  
  Abc obj = new Abc() -> System.out.println("Hey There");
  obj.show();
  }
}
