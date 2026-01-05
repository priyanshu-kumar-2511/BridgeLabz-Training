package com.sorting.quicksort.productprices;

import java.util.Scanner;
import java.util.Arrays;

/*4. Quick Sort - Sort Product Prices
Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        QuickSortProducts sorter = new QuickSortProducts();
        sorter.sortPrices(prices, 0, prices.length - 1);

        System.out.println("\nSorted Product Prices:");
        System.out.println(Arrays.toString(prices));
    }
}
