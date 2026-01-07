package digitalbookstoresystem;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;

    protected double discountRate;

    public Book(String title, String author, double price, int stock) {
        this(title, author, price, stock, 0);
    }

    public Book(String title, String author, double price, int stock, double discountRate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    protected void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new RuntimeException("Out of stock");
        }
        stock -= quantity;
    }

    public double getPrice() {
        return price;
    }
}


