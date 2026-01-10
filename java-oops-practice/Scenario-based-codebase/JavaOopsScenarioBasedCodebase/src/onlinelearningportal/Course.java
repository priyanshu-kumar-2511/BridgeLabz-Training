package onlinelearningportal;

import java.util.*;

public abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected int totalModules;

    private double rating;                     
    private final List<String> reviews;        

    // Default module list
    public Course(String title, Instructor inst) {
        this(title, inst, 5);
    }

    // Custom module count
    public Course(String title, Instructor inst, int modules) {
        this.title = title;
        this.instructor = inst;
        this.totalModules = modules;
        this.rating = 4.0;
        this.reviews = new ArrayList<>();
    }

    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;   // operator logic
    }

    public double getRating() {
        return rating;
    }

    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public void addReview(String r, double score) {
        reviews.add(r);
        updateRating(score);
    }
}
