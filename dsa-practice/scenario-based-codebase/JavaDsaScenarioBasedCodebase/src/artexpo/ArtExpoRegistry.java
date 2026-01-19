package artexpo;

import java.util.*;

public class ArtExpoRegistry {

    private List<Artist> artists = new ArrayList<>();

    // Add artist and keep list sorted by registration time
    public void registerArtist(String name, int time) {
        artists.add(new Artist(name, time));
        insertionSort();
        System.out.println("Artist registered");
    }

    // Insertion Sort (ascending by registration time)
    private void insertionSort() {
        for (int i = 1; i < artists.size(); i++) {
            Artist key = artists.get(i);
            int j = i - 1;

            while (j >= 0 && artists.get(j).registrationTime > key.registrationTime) {
                artists.set(j + 1, artists.get(j));
                j--;
            }

            artists.set(j + 1, key);
        }
    }

    public void showArtists() {
        if (artists.isEmpty()) {
            System.out.println("No artists registered yet");
            return;
        }

        System.out.println("\nArtist Booth Order (Early → Late):");
        for (Artist a : artists) {
            System.out.println(
                a.name + " | Registered at: " + a.registrationTime
            );
        }
    }
}
