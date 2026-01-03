package universitycourseenrollmentsystem;

public class Enrollment implements Graded {

    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student s, Course c) {
        this.student = s;
        this.course = c;
    }

    @Override
    public void assignGrade(String grade) {
        this.grade = grade;
        student.updateGPA();
    }

    public String getGrade() {
        return grade;
    }

    public Course getCourse() {
        return course;
    }

    public double getNumericGrade() {
        if (student instanceof Postgraduate) {
            return grade.equals("Pass") ? 4.0 : 0.0;
        } else {
            switch (grade) {
                case "A": return 4.0;
                case "B": return 3.0;
                case "C": return 2.0;
                default: return 0.0;
            }
        }
    }
}

