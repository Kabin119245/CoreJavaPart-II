import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class usingForEach {
    public static void main(String[] args) {

        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(9);
        // nums.add(18);
        // nums.add(-7);
        // nums.add(26);
        // nums.add(5);

        // there is another way also

        List<Integer> nums = Arrays.asList(5, 6, -1, 0, 10, 20);

        // 1.Consumer<Integer> con = new Consumer<Integer>() {

        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }

        // };

        //As it is the functional inteface, we can modify it

        //2. Consumer<Integer> con =  n -> System.out.println(n);
            

        
        

        System.out.println(nums);
        // to print one by one we have various methods

        //3.nums.forEach(con);
        //So in place of con, we can replace above code
            //Step4
        nums.forEach(n->System.out.println(n));


    }
}
