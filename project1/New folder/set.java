
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
         Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(61);
        nums.add(54);
        nums.add(82);
        nums.add(24);

        Iterator<Integer> values =nums.iterator();

        while(values.hasNext())
        System.out.println(values.next());
        
    }
}
