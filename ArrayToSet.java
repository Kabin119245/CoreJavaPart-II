import java.util.*;

public class ArrayToSet {

    public static void main(String[] args) {

        String[] array = { "a", "b", "c" };
        for (String s : array) {
            System.out.println(s);
        }
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " + set);
    }

}
