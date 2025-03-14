import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();

        students.put("riya", 65);
        students.put("zoya", 45);
        students.put("raj", 88);
        students.put("harsh", 75);

        System.out.println(students.keySet());

        for(String key:students.keySet()){
System.out.println(key +":" + students.get(key));
        }
    }
}
