import java.util.Arrays;
import java.util.List;

public class methodr {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("navin","harsh","john");
        List<String> uNames = names.stream()
        .map(String:: toUpperCase)
        .toList();

        uNames.forEach(System.out::println);
    }
}
