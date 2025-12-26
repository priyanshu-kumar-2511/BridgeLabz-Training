import java.util.Scanner;

public class RajResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        // Input marks using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double average = total / 5.0;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average = " + average);

        // Convert average into grade category
        int gradeKey = (int) average / 10;
        char grade;

        switch (gradeKey) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Final Grade = " + grade);

        sc.close();
    }
}
