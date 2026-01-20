package flashdealz;

/*4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("\n===== FlashDealz =====");
            System.out.println("1. Add Product");
            System.out.println("2. Sort by Discount");
            System.out.println("3. View Products");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Product name: ");
                    String name = sc.nextLine();
                    System.out.print("Discount (%): ");
                    double disc = sc.nextDouble();
                    products.add(new Product(name, disc));
                    System.out.println("Product added");
                    break;

                case 2:
                    QuickSort.quickSort(products);
                    System.out.println("Products sorted by discount");
                    break;

                case 3:
                    if (products.isEmpty()) {
                        System.out.println("No products available");
                        break;
                    }
                    System.out.println("\nFlash Sale Leaderboard:");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.println("Flash sale ended");
                    return;
            }
        }
    }
}
