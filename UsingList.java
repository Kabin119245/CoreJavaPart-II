import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsingList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(10);
        nums.add(-5);
        nums.add(55);

        // System.out.println(nums);
        // for (Object n : nums) {
        //     int num = (Integer) n;
        //     System.out.println(num);
        // }

        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(-5));

        //if we want to have no duplication value we use Set instead of List

        
        


    }
}


