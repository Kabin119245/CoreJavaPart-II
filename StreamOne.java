import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOne {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(-5);
        nums.add(12);
        nums.add(-16);
        nums.add(25);
        nums.add(35);

        Stream<Integer> s1 = nums.stream();
        // to get only even numbers
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Doubling even numbers filtered
        Stream<Integer> s3 = s2.map(n -> n * 2);

        s3.forEach(n -> System.out.println(n));
        // We can write in same statement as follows
        // int result = nums.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (c,e) -> c+e);

        // System.out.println(result);

        // whatever operation we want to do, we can do in stream s1, beacuse it will not
        // affect original list

        // s1.forEach(n -> System.out.println(n));
        // we cannot resue stream as its name suggest

    }
}
