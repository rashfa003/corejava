 class A {
public A(){
    super();
    System.out.println("in A");
}
  public A(int n)  {
    super();
    System.out.println("in A int");
  }
}
  class B extends A{
  
  public B(){
    super();
    System.out.println("in B");
}
  public B(int n)  {
    this();
    System.out.println("in B int");
  }
}
 

public class demothsu {
    public static void main(String[] args) {
        B obj5 = new B(5);
    }
}
 