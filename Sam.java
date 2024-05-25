//this interface is called SAM - sigle absgtract method interface or functional interface
@FunctionalInterface
interface A {
    void show();
}
interface B {
    void show1(int i);
}
//etiher we can implement above method using class or we can use anonymous inner class, which can also be modified using lambda expression
public class Sam {
    public static void main(String[] args) {

        A obj = ()  -> System.out.println("in new show");
        obj.show();
    
        
    //what we used to do 
        // B obj1 = new B(){
        
        //     public void show1(int i) {
        //         System.out.println("In B show" + i);
        //     }
        // };
        // obj1.show1(10);


        //we can do it by lambda expression as

        B obj1 = i -> System.out.println("In B show" + i);
           
        
        obj1.show1(10);


    }
}