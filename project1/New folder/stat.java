
class A2 {
int age;
public void show(){
System.out.println ("in show");
}
static class B2{
public void config(){
System.out.println("in config");
}
}
}
public class stat {
    public static void main(String[] args) {
       A2 obj=new A2();
       obj.show();
      A2.B2 obj1= new A2.B2();
       obj1.config ();
    }
}
