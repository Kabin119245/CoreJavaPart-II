class KabinException extends Exception {

    public KabinException(String message) {

        super(message);
        
    }

}

public class Throw {

    public static void main(String[] args) {
        int i = 50;
        int j = 0;

        try{
             j = 18/i;

             if (j == 0 ){
                 throw new KabinException("I don't want to print Zero");
             }
        }

        catch(ArithmeticException e){
             j = 18/1;
            System.out.println(e);
        }

        catch(Exception e){
             j = 18/1;
            System.out.println(e);
        }

        System.out.println(j);
    }

}
