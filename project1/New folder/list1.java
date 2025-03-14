import java.util.Arrays;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
      List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
      nums.forEach(n-> System.out.println(n));
    }
}
