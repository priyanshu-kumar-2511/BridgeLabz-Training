package gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price) {
        super(title, "Strategy", price);
    }

    public StrategyGame(String title) {
        super(title, "Strategy");
    }

    public void download(User user) {
        double cost = getDiscountedPrice();
        if (!user.deduct(cost)) {
            System.out.println("Not enough balance");
            return;
        }
        user.addGame(this);
        System.out.println("Downloaded Strategy Game: " + title);
    }

    public void playDemo() {
        System.out.println("Strategy demo: Plan your next move!");
    }
}

