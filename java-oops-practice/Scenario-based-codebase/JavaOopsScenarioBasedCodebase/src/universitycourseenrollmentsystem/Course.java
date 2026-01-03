package universitycourseenrollmentsystem;

public class Course {
    private String code;
    private String title;
    private int credits;

    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public String getDetails() {
        return code + " - " + title;
    }
}
