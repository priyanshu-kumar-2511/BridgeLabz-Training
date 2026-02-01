package com.collectors.librarybookstatistics;

/*5. Library Book Statistics
Given a list of books with their genres and number of pages, use
Collectors.summarizingInt()
to find total pages, average pages, and maximum pages per genre.*/

import java.util.*;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Book A", "Fiction", 300),
                new Book("Book B", "Fiction", 450),
                new Book("Book C", "Science", 500),
                new Book("Book D", "Science", 350),
                new Book("Book E", "History", 400)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream().collect(Collectors.groupingBy(
                                Book::getGenre, Collectors.summarizingInt(Book::getPages)));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println("Min Pages: " + stats.getMin());
            System.out.println("Book Count: " + stats.getCount());
            System.out.println();
        });
    }
}
