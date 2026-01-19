package icecreamrush;

/*1. IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        IceCreamShop shop = new IceCreamShop();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Ice Cream Rush =====");
            System.out.println("1. Add Flavor Sales");
            System.out.println("2. Sort by Popularity");
            System.out.println("3. View Report");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Flavor name: ");
                    String name = sc.nextLine();

                    System.out.print("Units sold this week: ");
                    int sold = sc.nextInt();

                    shop.addFlavor(name, sold);
                    break;

                case 2:
                    shop.sortByPopularity();
                    break;

                case 3:
                    shop.showFlavors();
                    break;

                case 4:
                    System.out.println("Shop closed for the week");
                    return;
            }
        }
    }
}
