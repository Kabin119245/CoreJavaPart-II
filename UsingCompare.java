import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingCompare {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            // lets sort using the last digit
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10) {
                    return 1;
                } else
                    return -1;
            }

        };

        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(41);
        nums.add(29);
        nums.add(10);

        Collections.sort(nums,comp);

        System.out.println(nums);
        // to sort we can use Collections ,sort

    }
}
