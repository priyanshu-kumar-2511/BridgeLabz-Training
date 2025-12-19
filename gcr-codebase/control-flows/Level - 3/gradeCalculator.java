import java.util.Scanner;
class gradeCalculator{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Mathematics marks: ");
        int maths = input.nextInt();

        // Calculating the average percentage
        double average = (physics + chemistry + maths) / 3.0;

        char grade;
        String remarks;

        // calculating the grade
        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1, too below standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // displaying the result
        System.out.printf("Average Percentage: %f%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
