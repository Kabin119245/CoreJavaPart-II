import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        BufferedReader br = null;

        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        finally {
            // in finally block we close the resource, beacuse it is going to be executed no
            // matter exception occurs or not
            System.out.println("I am goin to execute irrespective of the exception");

            br.close();
        }
    }
}
