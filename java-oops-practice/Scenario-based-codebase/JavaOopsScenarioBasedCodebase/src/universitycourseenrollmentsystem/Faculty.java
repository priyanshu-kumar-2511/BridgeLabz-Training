package universitycourseenrollmentsystem;

public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void gradeStudent(Enrollment e, String grade) {
        e.assignGrade(grade);
    }
}

