package onlinelearningportal;

/*21. "SkillForge – Online Learning Portal"
Story: A startup builds SkillForge, where instructors upload courses and students enroll,
complete, and get certified.
Requirements:
● Course class: title, instructor, rating, modules[].
● User class → Student, Instructor (inheritance).
● Interface ICertifiable with generateCertificate() method.
● Constructors for courses with default or custom module lists.
● Use operators for grading, progress tracking.
● Encapsulation: course rating logic protected.
● Polymorphism: certificate format varies per course level.
● Access Modifiers: internal course reviews are read-only.*/

public class Main {
    public static void main(String[] args) {

        Instructor inst = new Instructor("Dr. Sharma");
        Student s = new Student("Priyanshu");

        Course java = new AdvancedCourse("Java Mastery", inst, 3);

        s.completeModule();
        s.completeModule();
        s.completeModule();

        java.addReview("Great course", 5);

        System.out.println(java.generateCertificate(s));
        System.out.println("Course Rating: " + java.getRating());
    }
}
