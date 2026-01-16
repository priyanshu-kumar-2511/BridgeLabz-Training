package cinemahouse;

/*7. CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CinemaSchedule schedule = new CinemaSchedule();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Cinema House =====");
            System.out.println("1. Add Movie Show");
            System.out.println("2. Sort Shows by Time");
            System.out.println("3. View Schedule");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter show time (HHMM): ");
                    int time = sc.nextInt();

                    schedule.addShow(name, time);
                    break;

                case 2:
                    schedule.sortByTime();
                    break;

                case 3:
                    schedule.showSchedule();
                    break;

                case 4:
                    System.out.println("Cinema closed");
                    return;
            }
        }
    }
}
