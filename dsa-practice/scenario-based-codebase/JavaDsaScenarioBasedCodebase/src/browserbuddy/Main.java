package browserbuddy;

import java.util.Scanner;

/*2. BrowserBuddy – Tab History Manager (Doubly Linked List + Stack)
Story: Neha is working on a custom browser. Each open tab maintains its browsing history with "Back" and "Forward" operations. She uses a Doubly Linked List for history and a Stack to hold closed tabs for reopening.
Requirements:
● Support forward and backward navigation.
● Restore recently closed tabs.
● Maintain memory-efficient tab management using pointers.
*/

public class Main {
    public static void main(String[] args) {

        Browser browser = new Browser();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BrowserBuddy =====");
            System.out.println("1. Visit a website");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Open new tab");
            System.out.println("5. Close tab");
            System.out.println("6. Reopen closed tab");
            System.out.println("7. Show current page");
            System.out.println("8. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.getCurrentTab().visit(url);
                    break;

                case 2:
                    browser.getCurrentTab().back();
                    break;

                case 3:
                    browser.getCurrentTab().forward();
                    break;

                case 4:
                    browser.openNewTab();
                    break;

                case 5:
                    browser.closeTab();
                    break;

                case 6:
                    browser.reopenTab();
                    break;

                case 7:
                    System.out.println("Current Page: " + browser.getCurrentTab().getCurrentPage());
                    break;

                case 8:
                    System.out.println("Browser closed");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
