class A {
    private int age;

    public void show() {
        System.out.println("In A show");
    }

    class B {//inner class
        public void config() {
            System.out.println("In B config");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        //to call show() it is very easy 
        A obj = new A();
        obj.show();
        
        A.B obj1 = obj.new B();
        //we can make inner class as static class, and we know that we dont need object for static class, if B was static classs then
       // A.B obj2 =new A.B();

        obj1.config();

    }
    
}
