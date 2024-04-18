enum Status {
    Running, Failed, Pending, Success;
    //they are the named constants
    
}


public class Enums {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        //to print all
        for (Status s1 : Status.values()) {
            System.out.println(s1);
        }
    }
}