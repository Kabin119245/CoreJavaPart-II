class M {
    public void show() {
        System.out.println("In M show");
    }
}
// what if we want to change the implementation of the show function, there is one method of creating another class that extends M (method overriding) but the only purpose of this new class is just for overriding and may be it can be used only once, so for that we have the concept of anonymous inner class


public class AnonymousInnerClass {
    public static void main(String[] args) {
        M obj = new M() {
            //very important concept

            public void show() {

                System.out.println("in new show, anonymous inner class");
            }
        };
        obj.show();
    }
    
}
