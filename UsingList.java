import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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

        //if we want to have no duplication value(unique value) we use Set instead of List

        Set<Integer> nums2 = new HashSet<Integer>();

        nums2.add(12);
        nums2.add(5);
        nums2.add(17);
        nums2.add(-10);
        nums2.add(15);

        //printing all values
        System.out.println("Using Set");
        for(int n: nums2) {
            System.out.println(n);
        }

        //if we want sorted elements, we use TreeSet in place of HashSet

        //Set<Integer> sorted = new TreeSet<Integer>(); and we use it with collection also

        //we can alos use iterator method to display all elements as Iterator is Super Class of Collection also
        System.out.println("Using Iterator");
        Iterator<Integer> values = nums2.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }
    

    }
}


