package digitalbookstoresystem;

public class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE, 0.20);
    }

    public double applyDiscount(int quantity) {
        return price * quantity * discountRate;
    }
}
