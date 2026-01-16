package smartshelf;

/*2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SmartShelf shelf = new SmartShelf();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SmartShelf System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Reading List");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    shelf.addBook(title);
                    break;

                case 2:
                    shelf.showShelf();
                    break;

                case 3:
                    System.out.println("System closed \nThanks you for using!");
                    return;
            }
        }
    }
}
