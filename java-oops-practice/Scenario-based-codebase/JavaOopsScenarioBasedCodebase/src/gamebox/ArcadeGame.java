package gamebox;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price) {
        super(title, "Arcade", price);
    }

    public ArcadeGame(String title) {
        super(title, "Arcade");
    }

    public void download(User user) {
        double cost = getDiscountedPrice();
        if (!user.deduct(cost)) {
            System.out.println("Not enough balance");
            return;
        }
        user.addGame(this);
        System.out.println("Downloaded Arcade Game: " + title);
    }

    public void playDemo() {
        System.out.println("Arcade demo: Fast action gameplay!");
    }
}
