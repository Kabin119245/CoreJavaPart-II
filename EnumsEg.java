enum Laptop {
    MacBook(2000), XPS(1800), VivoBook(1200), Vostro(1100);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumsEg {

    public static void main(String[] args) {

        Laptop lap = Laptop.VivoBook;

        System.out.println(lap + ":" +lap.getPrice());

    //to print all values, we use enhanced for loop

        for (Laptop lap1 : Laptop.values()) {

            System.out.println(lap1 + ":" +lap.getPrice());

        }
    }
    
}
