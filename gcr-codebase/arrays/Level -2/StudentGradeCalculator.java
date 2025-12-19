import java.util.Scanner;
class StudentGradeCalculator{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];      // Physics, Chemistry, Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // taking marks from user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0)
                        System.out.print("Physics: ");
                    else if (j == 1)
                        System.out.print("Chemistry: ");
                    else
                        System.out.print("Maths: ");

                    int m = input.nextInt();

                    if (m >= 0 && m <= 100) {
                        marks[i][j] = m;
                        break;
                    } else {
                        System.out.println("Invalid marks!");
                    }
                }
            }

            // Calculating percentage and grade
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // Displaying the result
        System.out.println("\n--- Student Result ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

        input.close();
    }
}
