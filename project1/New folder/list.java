import java.util.ArrayList;
import java.util.List;


public  class list{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);
        
        for(Object n: nums ){
            int num= (Integer)n;
            System.out.println(num*2);
        }

    }
}
