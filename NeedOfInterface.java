interface Computer {
     void code() ;
    
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code..compile...test...run : Faster");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code..compile...test...run");
    }

}


class Developer{
    public void devApp(Computer comp) {
        // System.out.println("Coding");
        comp.code();
    }

}

public class NeedOfInterface {

    public static void main(String[] args) {

        Computer lap = new Laptop();
      

        Computer desk = new Desktop();

        Developer dep = new Developer();
        dep.devApp(desk); //code() will be called on the basis of what type of object is, (laptop or Desktop)
    }
    
}
