//while using List or ArrayList we know that they have index value like 0,1,2,3 what if we want different kinds of index values like any name in that case we use map, it has a key and value

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();
        // HashTable also

        students.put("Kabin", 100);
        students.put("Kabina", 85);
        students.put("Kanchan", 85);
        students.put("Asmita", 75);
        students.put("Anushree", 70);

        System.out.println(students);
        // to get individual we use key

        System.out.println(students.get("Kabin"));

        // to change
        students.put("Anushree", 85);
        // as we are not geting new Anushree, so we conclude that key cannot be repeated

        // to print one by one we use enhanced for loop

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }

}
