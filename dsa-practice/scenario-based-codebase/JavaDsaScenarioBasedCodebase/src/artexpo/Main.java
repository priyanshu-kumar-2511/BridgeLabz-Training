package artexpo;

/*9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArtExpoRegistry registry = new ArtExpoRegistry();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ArtExpo Registration Desk =====");
            System.out.println("1. Register Artist");
            System.out.println("2. View Booth Assignment Order");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter artist name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter registration time (minutes): ");
                    int time = sc.nextInt();

                    registry.registerArtist(name, time);
                    break;

                case 2:
                    registry.showArtists();
                    break;

                case 3:
                    System.out.println("ArtExpo registration closed");
                    return;
            }
        }
    }
}
