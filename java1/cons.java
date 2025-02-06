class Human{
    private int age1;
    private String name2;

    public Human(){
        age1= 33;
       name2= "riya";
    }
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
public class cons {
    public static void main(String[] args) {
        Human obj2=new Human();
        Human obj3=new Human();
        System.out.println(obj2.getname2()+ ":" + obj2.getage1()); 
    }
    
}
