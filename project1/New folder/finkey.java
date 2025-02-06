class Calc{
    public final void show(){
            System.out.println("by riya");
        }
        public void add(int a,int b) {
        System.out.println(a+b);
            
        }
    
        
    }
    class AdvCalc extends Calc{
        public void show(){
            System.out.println("by ziya");
        }
}

public class finkey {
    public static void main(String[] args) {
        AdvCalc obj= new AdvCalc();
        obj.show();
        obj.add(5, 4);
    }
}
