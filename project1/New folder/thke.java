class human{
    private int age1;
    private String name2;

public int getage1(){
    
        return age1;
}
public void setage1(int a){
this.age1=a;
}
public String getname2(){
return name2;
}
public void setname2(String n){
this.name2=n;
}
}
public class thke {
    public static void main(String[] args) {
        human obj2=new human();
        obj2.setage1(30);
        obj2.setname2("riya");

        System.out.println(obj2.getname2()+ ":" + obj2.getage1());
    }
}
