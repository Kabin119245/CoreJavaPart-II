//if we want that only certain class can inherit class A then there is a Sealed Class
sealed class A permits B,C {

}
//the permitted class should be sealed, non-sealed or final class
non-sealed class B extends A { //sealed, non-sealed or final

}

final class C extends A {

}

class D { //D cannot extend class A

}


public class SealedClass {
    
}
