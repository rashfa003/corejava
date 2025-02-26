interface A5{
    void show(int i);
}

public class lamb {
    public static void main(String[] args) {
        A5 obj = i -> System.out.println("in show "+ i);
        obj.show(5);
    }
}
