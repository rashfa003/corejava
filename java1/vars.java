
class mobile1{
    String brand;
    int price;
     static String name1;
     
     public void show(){
        System.out.println(brand + " :" + price+ " :" + name1);
     }
}
public class vars{
    public static void main(String[] args) {
        
    

        {
            mobile1 obj1=new mobile1();
            obj1.brand ="apple";
            obj1.price=100000;
            mobile1.name1="smartphone";
    
            mobile1 obj2=new mobile1();
            obj2.brand ="samsung";
            obj2.price=10000;
            mobile1.name1="smartphone";
            
            mobile1 obj3=new mobile1();
            obj3.brand ="xiomi";
            obj3.price=50000;
            mobile1.name1="smartphone";
            
            obj1.show();
            obj2.show();
            
        }
    }
    }

