

enum Status{
    Running,Failed,Pending,Success;
}
public class enm {
    public static void main(String[] args) {
        int i=5;
        Status[] ss= Status.values();

        for(Status s: ss){
            System.out.println(s);
        }
    }
}
