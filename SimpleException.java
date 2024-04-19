//understanding try and catch block using simple problem
public class SimpleException {

    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];

        String str=null;

        try {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[5]);
            
        }

        catch (ArithmeticException e) {
             System.out.println(e.getMessage());
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        //Exception is (parent) class, make sure it is at bottom
        catch(Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
    
}
