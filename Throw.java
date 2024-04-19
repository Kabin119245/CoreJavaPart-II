public class Throw {

    public static void main(String[] args) {
        int i = 50;
        int j = 0;

        try{
             j = 18/i;

             if (j == 0 ){
                 throw new ArithmeticException("I don't want to print Zero");
             }
        }

        catch(ArithmeticException e){
             j = 18/1;
            System.out.println(e);
        }

        System.out.println(j);
    }

}
