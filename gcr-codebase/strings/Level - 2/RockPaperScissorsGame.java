import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method 1: Get computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // Method 2: Find winner of a single game
    // Returns: "User", "Computer", or "Draw"
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) return "Draw";

        if (
            (user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))
        ) {
            return "User";
        }

        return "Computer";
    }

    // Method 3: Calculate wins and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    // Method 4: Display game results & stats
    public static void displayResults(
            String[][] games,
            String[][] stats
    ) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----\t----\t--------\t------");

        for (int i = 0; i < games.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                games[i][0] + "\t" +
                games[i][1] + "\t\t" +
                games[i][2]
            );
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("------\t----\t-----");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int gamesCount = sc.nextInt();
        sc.nextLine(); // clear buffer

        String[][] gameResults = new String[gamesCount][3];

        int userWins = 0, computerWins = 0;

        for (int i = 0; i < gamesCount; i++) {

            System.out.print(
                "\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): "
            );
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, gamesCount);
        displayResults(gameResults, stats);

        sc.close();
    }
}
