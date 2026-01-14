package gamebox;

/*24. "GameBox – Mobile Game Distribution Platform"
Story: GameBox offers mobile games for download and purchase with features like demos,
reviews, and leaderboards.
Requirements:
● Game class: title, genre, price, rating.
● User class with list of owned games.
● Interface IDownloadable: download(), playDemo().
● Constructors to set up free or paid games.
● Use operators to apply seasonal offers.
● Encapsulation: user-owned game data protected.
● Inheritance: ArcadeGame, StrategyGame from Game.
● Polymorphism: playDemo() behaves differently per genre.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User("Priyanshu", 2000);

        Game g1 = new ArcadeGame("Subway Runner", 500);
        Game g2 = new StrategyGame("War Zone", 800);
        Game g3 = new ArcadeGame("Brick Breaker");   // free game

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== GameBox =====");
            System.out.println("1. Play Demo");
            System.out.println("2. Download Arcade Game");
            System.out.println("3. Download Strategy Game");
            System.out.println("4. Show My Games");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    g1.playDemo();
                    g2.playDemo();
                    break;
                case 2:
                    g1.download(user);
                    break;
                case 3:
                    g2.download(user);
                    break;
                case 4:
                    user.showLibrary();
                    break;
                case 5:
                    System.out.println("GameBox closed");
                    return;
            }
        }
    }
}
