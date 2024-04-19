//this interface is called SAM - sigle absgtract method interface or functional interface
@FunctionalInterface
interface A {
    void show();
}

//etiher we can implement above method using class or we can use anonymous inner class, which can also be modified using lambda expression
public class Sam {
    public static void main(String[] args) {

        A obj = ()  -> System.out.println("in new show");
        obj.show();
    }
}