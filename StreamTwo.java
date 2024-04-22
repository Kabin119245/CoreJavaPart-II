import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(-10);
        list.add(99);
        list.add(56);
        list.add(12);
        list.add(19);
        list.add(13);
        list.add(67);


        Stream<Integer> sorted = list.stream()
                                 
                                 .sorted();


        sorted.forEach(n -> System.out.println(n));                               


    }
}
