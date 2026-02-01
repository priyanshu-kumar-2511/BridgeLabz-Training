package com.streamapi.stream.top5trendingmovies;

/*1. Top 5 Trending Movies
○ Scenario: From a huge movie list, find the top 5 based on rating and release
year.
○ Task: Use filter(), sorted(), limit().*/

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.9, 2023),
                new Movie("Movie B", 9.1, 2022),
                new Movie("Movie C", 8.7, 2024),
                new Movie("Movie D", 9.1, 2024),
                new Movie("Movie E", 8.5, 2021),
                new Movie("Movie F", 9.3, 2023),
                new Movie("Movie G", 8.2, 2022),
                new Movie("Movie H", 8.9, 2024)
        );

        List<Movie> top5 = movies.stream()

                // optional filter example (e.g., rating above 8)
                .filter(movie -> movie.getRating() >= 8.0)

                // sort by rating desc, then release year desc
                .sorted(Comparator.comparing(Movie::getRating).reversed()
                .thenComparing(Comparator.comparing(Movie::getReleaseYear).reversed()))
                .limit(5).collect(Collectors.toList());

        top5.forEach(System.out::println);
    }
}
