//Wrapper Class
// int -> Integer
// char -> Character
// double -> Double
public class Wrapper {
    public  static void main (String[] args) {

        int num = 7; //primitive type, num is a primitive variable
        //Integer num1 = new Integer(5);it is known as Boxing
        //insted of doing this we can directly assign as
        Integer num1 = num; //autobocing


        int num2 = num1.intValue(); //unboxing
        int num3 = num1; //autounboxing

        System.out.println(num1 + " " + num2 + " " + num3);

        String str = "12";

        int num5 = Integer.parseInt(str);
        System.out.println(num5);

       
        
    }
    
}
