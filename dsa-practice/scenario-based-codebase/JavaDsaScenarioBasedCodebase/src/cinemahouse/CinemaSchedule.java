package cinemahouse;

import java.util.*;

public class CinemaSchedule {

    private List<Show> shows = new ArrayList<>();

    public void addShow(String name, int time) {
        shows.add(new Show(name, time));
        System.out.println("Show added");
    }

    // Bubble Sort by show time (ascending)
    public void sortByTime() {
        int n = shows.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (shows.get(j).time > shows.get(j + 1).time) {
                    Show temp = shows.get(j);
                    shows.set(j, shows.get(j + 1));
                    shows.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) break; // already sorted
        }

        System.out.println("Shows sorted by time");
    }

    public void showSchedule() {
        if (shows.isEmpty()) {
            System.out.println("No shows scheduled");
            return;
        }

        System.out.println("\nToday's Movie Schedule:");
        for (Show s : shows) {
            System.out.println(s.movieName + " at " + formatTime(s.time));
        }
    }

    private String formatTime(int t) {
        int h = t / 100;
        int m = t % 100;
        return String.format("%02d:%02d", h, m);
    }
}
