package collegeinformationsystem;

/*8. "CampusConnect – College Information System"
Story: Your university launches CampusConnect, a portal to manage students, teachers, and
courses. You're developing the academic module.
Requirements:
● Person (base class): common fields like name, email, id.
● Student and Faculty extend Person (use inheritance).
● ICourseActions interface with methods like enrollCourse() and dropCourse().
● Course class has a list of students and a faculty assigned.
● Use constructors to initialize students and courses.
● Use access modifiers: student grades must be private.
● Use operators to calculate GPA based on grades.
● Polymorphism: printDetails() works differently for Student and Faculty.
*/

public class Main {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. Sharma", "sharma@college.edu", "Computer Science");

        Course java = new Course("Java Programming", f1);

        double[] grades1 = {8.5, 9.0, 7.5};
        Student s1 = new Student(1, "Aman", "aman@gmail.com", grades1);

        double[] grades2 = {9.2, 8.8, 9.5};
        Student s2 = new Student(2, "Riya", "riya@gmail.com", grades2);

        s1.enrollCourse(java);
        s2.enrollCourse(java);

        System.out.println("\n--- Student Details ---");
        s1.printDetails();
        System.out.println();
        s2.printDetails();

        System.out.println("\n--- Faculty Details ---");
        f1.printDetails();

        System.out.println("\n--- Course Details ---");
        java.printCourseDetails();
    }
}
