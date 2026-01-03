package universitycourseenrollmentsystem;

/*3. University Course Enrollment System
Scenario: Students should be able to enroll in courses, and faculty can assign grades.
Concepts Used:
● Class: Student, Course, Faculty, Enrollment
● Constructors: Used to create students with/without elective preferences
● Access Modifiers: private for internal GPA fields, public method to access
transcript
● Interface: Graded with method assignGrade()
● Operators: GPA calculations and comparisons (using +, /, etc.)
● OOP:
○ Encapsulation: Secure handling of grades
○ Inheritance: Undergraduate, Postgraduate extend Student

Scenario-based Problems
○ Abstraction: Interface allows different grading styles
○ Polymorphism: assignGrade() works differently for pass/fail vs. letter grading
*/

public class MainUniversitySystem {
    public static void main(String[] args) {

        Course java = new Course("CS101", "Java", 4);
        Course ai = new Course("CS501", "AI", 5);

        Student ug = new Undergraduate("U101", "Priyanshu");
        Student pg = new Postgraduate("P202", "Rahul");

        ug.enroll(java);
        pg.enroll(ai);

        Faculty prof = new Faculty("Dr. Sharma");

        Enrollment ugEnroll = ug.enrollments.get(0);
        Enrollment pgEnroll = pg.enrollments.get(0);

        prof.gradeStudent(ugEnroll, "A");       // letter grading
        prof.gradeStudent(pgEnroll, "Pass");    // pass/fail

        System.out.println(ug.getTranscript());
        System.out.println("-------------------------");
        System.out.println(pg.getTranscript());
    }
}
