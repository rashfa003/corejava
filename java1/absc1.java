abstract class car{
    public abstract void drive ();
    public abstract void fly ();
    public void playmusic (){
    System.out.println("play music");
    }
}
    abstract class WagonR extends car {
    public void drive(){
    System.out.println("driving");
    }
}
    class UpdatedWagonR extends WagonR{

        @Override
        public void fly() {
            
          System.out.println("flying"); 
        }
    }
    
public class absc1 {
    public static void main(String[] args) {
        car obj = new UpdatedWagonR();
        obj.drive();
        obj.playmusic();
        obj.fly(); 
    }
}
 
