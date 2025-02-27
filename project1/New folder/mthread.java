class A6 extends Thread{
    public void run()
    {
        for(int i=1;i<=50;i++)
        {
            System.out.println("hi");
        }
    }
}
    class B6 extends Thread{
        public void run(){
            for(int i=1;i<=50;i++){
                System.out.println("hello");
            }
        }
    }


public class mthread {
    public static void main(String[] args) {
        A6 obj=new A6();
        B6 obj1=new B6();

        obj.start();
        obj1.start();

    }
}
