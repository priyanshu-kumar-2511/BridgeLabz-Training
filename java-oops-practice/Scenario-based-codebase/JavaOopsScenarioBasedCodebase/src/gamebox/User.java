package gamebox;

import java.util.*;

public class User {
    private String name;
    private double wallet;
    private List<Game> ownedGames = new ArrayList<>();

    public User(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public boolean deduct(double amount) {
        if (wallet < amount) return false;
        wallet -= amount;
        return true;
    }

    public void addGame(Game g) {
        ownedGames.add(g);
    }

    public void showLibrary() {
        System.out.println("\n Your Games:");
        for (Game g : ownedGames)
            System.out.println("- " + g.title);
        System.out.println("Balance: Rs" + wallet);
    }
}
