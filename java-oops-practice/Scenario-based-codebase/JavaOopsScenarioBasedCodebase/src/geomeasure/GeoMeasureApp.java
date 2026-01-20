package geomeasure;

/*1. You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.*/

import java.util.*;

public class GeoMeasureApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> comparisonHistory = new ArrayList<>();

        while (true) {
            System.out.println("\n===== GeoMeasure Solutions =====");
            System.out.println("1. Compare Two Lines");
            System.out.println("2. View Comparison History");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Application closed");
                return;
            }

            if (choice == 1) {
                System.out.println("Enter Line 1 coordinates (x1 y1 x2 y2):");
                Line l1 = new Line(
                        sc.nextDouble(),
                        sc.nextDouble(),
                        sc.nextDouble(),
                        sc.nextDouble()
                );

                System.out.println("Enter Line 2 coordinates (x1 y1 x2 y2):");
                Line l2 = new Line(
                        sc.nextDouble(),
                        sc.nextDouble(),
                        sc.nextDouble(),
                        sc.nextDouble()
                );

                double len1 = l1.length();
                double len2 = l2.length();

                String result;
                if (len1 == len2) {
                    result = "Both lines are equal in length";
                } else if (len1 > len2) {
                    result = "Line 1 is longer";
                } else {
                    result = "Line 2 is longer";
                }

                System.out.println(result);
                comparisonHistory.add(result);
            }

            if (choice == 2) {
                System.out.println("\nComparison History:");
                for (String s : comparisonHistory) {
                    System.out.println("- " + s);
                }
            }
        }
    }
}
