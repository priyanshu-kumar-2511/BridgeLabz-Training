package gamebox;

public abstract class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = 4.0;
    }

    public Game(String title, String genre) {   // free game
        this(title, genre, 0);
    }

    protected double getDiscountedPrice() {
        return price * 0.8;   // 20% seasonal offer
    }
}

