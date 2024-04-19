//understanding try and catch block using simple problem
public class SimpleException {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18/i;
        }

        catch (Exception e) {
             System.out.println(e.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye");
    }
    
}
