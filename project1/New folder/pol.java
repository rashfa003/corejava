class A1{
    public void show()
    {
        System.out.println("in A show");

    }
}class B1 extends A1{
    public void show()
    {
      System.out.println("in B show");
    }

}class C1 extends A1{
    public void show(){
        System.out.println("in C show");
    }
}

public class pol {
    public static void main(String[] args) {
        A1 obj =new A1();
        obj.show();

        obj=new B1();
        obj.show();
         
        obj =new C1();
        obj.show();
         
    }
         
}      


