import java.rmi.Naming;
import java.util.Scanner;

public class RmiClient {
    public static void main(String[] args) {

        try {
            RmiServerIntf obj = (RmiServerIntf) Naming.lookup("//localhost/CalculatorService");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();

            System.out.println("Addition result: " + obj.add(a, b));
            System.out.println("Subtraction result: " + obj.sub(a, b));
            System.out.println("Multiplication result: " + obj.mul(a, b));

            try {
                System.out.println("Division result: " + obj.div(a, b));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}