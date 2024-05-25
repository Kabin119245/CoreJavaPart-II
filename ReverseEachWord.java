
import java.io.*;
import java.util.*;

public class ReverseEachWord {
    // Java program to reverse individual
    // words in a given string using STL list

    // reverses individual words of a string
    static void reverseWords(String str) {
        Stack<Character> st = new Stack<Character>();

        // Traverse given string and push all
        // characters to stack until we see a space.
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));

            // When we see a space, we print
            // contents of stack.
            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }

        // Since there may not be space after
        // last word.
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }

    // Driver program to test above function
    public static void main(String[] args) {
        String str = "My country name is Nepal";
        reverseWords(str);

    }
}
