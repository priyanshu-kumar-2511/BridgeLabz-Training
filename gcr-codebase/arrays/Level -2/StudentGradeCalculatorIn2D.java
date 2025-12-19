import java.util.Scanner;
class StudentGradeCalculatorIn2D{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Physics, Chemistry, Maths
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Taking marks input from user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");

                    int value = input.nextInt();

                    if (value >= 0 && value <= 100) {
                        marks[i][j] = value;
                        break;
                    } else {
                        System.out.println("Invalid marks! Enter value between 0 and 100.");
                    }
                }
            }
        }

        // Calculating the percentage and grade
        for (int i = 0; i < n; i++) {
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
        System.out.println("\nStudent Result");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println("----------------------");
        }

        input.close();
    }
}
