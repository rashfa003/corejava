import java.util.Arrays;
import java.util.List;

public class optional {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("riya","laxmi","ziya","niya");
         String name= names.stream()
         .filter(str -> str.contains("x"))
         .findFirst()
         .orElse("not found");

         System.out.println(name);
    }
}
