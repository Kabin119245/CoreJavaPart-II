interface M {
    int add (int x, int y);
}
//lambda expression only works with functionalinterface

public class ReturnValue {
    public static void main(String[] args) {
        
    M obj = (x,y) ->  x + y;
        
    int r1 = obj.add(6,7);
    System.out.println(r1);
}  
}
