import java.util.ArrayList;
import java.util.Collection;

public class UsingCollection {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(10);
        nums.add(-5);
        nums.add(55);

        System.out.println(nums);
        for (Object n : nums) {
            int num = (Integer) n;
            System.out.println(num);
        }

        // what if the one of the nums was string like nums.add("5"), it will result
        // errrors, so we need to declare type also in colllection

        //in collection we dont have methods like getting index value, geting value of index so we use List instead

    }
}
