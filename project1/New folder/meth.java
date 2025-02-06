class Computer{
    public void playmusic(){
        System.out.println("music playing..");
    }
    public String getmeapen(int cost){
        if(cost>=10)
return "pen";
return "nothing";
    }
    
}

public class meth {
    public static void main(String[] args) {
        Computer obj =new Computer();

        obj.playmusic();
        String str =obj.getmeapen( 2);
        System.out.println(str);
    }
}
