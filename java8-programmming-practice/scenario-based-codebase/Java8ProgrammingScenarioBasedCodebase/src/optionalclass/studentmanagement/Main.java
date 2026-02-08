package optionalclass.studentmanagement;

/*Scenario 1: 
1.Student Management SystemA student record may or may not have an email ID. Use Optional to safely fetch the email.
2.If a student’s phone number is missing, return a default number using Optional.
3.Find a student by ID. If not found, display “Student not available” using Optional.
4.Fetch student address safely without throwing NullPointerException.
5.Return student nickname if present, otherwise return the student’s real name.
*/

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        System.out.println("=== All Student Details ===\n");

        for (Student student : service.getAllStudents()) {

            System.out.println("Student ID: " + student.getId());

            System.out.println("Name: " + service.getDisplayName(student));

            System.out.println("Email: " + service.getEmail(student));

            System.out.println("Phone: " + service.getPhone(student));

            System.out.println("Address: " + service.getAddress(student));
            
            System.out.println("------------------------------------------");
        }
    }
}
