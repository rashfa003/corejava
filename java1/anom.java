 
class A3 {
public void show()
{
System.out.println("in A3 show");
}
}

public class anom 
{
    public static void main(String[] args)
     {
        A3 obj=new A3(){
public void show(){
    System.out.println("in new show");
}
        };
    obj.show();
}
}
