package com.sorting.mergesort.bookprices;

import java.util.Scanner;
import java.util.Arrays;

/*3 Merge Sort - Sort an Array of Book Prices
Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements.
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        MergeSortBooks sorter = new MergeSortBooks();
        sorter.sortPrices(prices, 0, prices.length - 1);

        System.out.println("\nSorted Book Prices:");
        System.out.println(Arrays.toString(prices));
    }
}
