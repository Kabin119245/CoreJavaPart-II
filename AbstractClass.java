abstract class Car {
//if we have any abstract method in a class, then it should be abstract Class
        public  abstract void drive();

        public void playMusic() {
            System.out.println("Playing Music");
        }

}

class Toyota extends Car {  
    //toyota is concrete class
    public void drive() {
        System.out.println("Driving Car");
    }
}



public class AbstractClass {
    public static void main(String[] args) {
    //we cannot create object of abstract class
    Toyota obj = new Toyota();
    obj.drive();
    obj.playMusic();
    
    }
}
