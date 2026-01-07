package digitalbookstoresystem;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock, 0.10);
    }

    public double applyDiscount(int quantity) {
        if (quantity >= 5)
            return price * quantity * 0.15;
        return price * quantity * discountRate;
    }
}

