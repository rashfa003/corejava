
interface A4{
int age=44;
String area= "mumbai";

void show ();
void config();
}
class B4 implements A4
{ 
public void show (){
System.out.println("in show");
}
public void config(){
System.out.println("in config"); 
}
}

public class inter{
    public static void main(String[] args) {
        A4 obj ;
        obj= new B4();
        obj.show();
        obj.config();
        
        System.out.println(A4.area); 
    }
}
