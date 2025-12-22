import java.util.Scanner;

public class StudentGradeSystem {

    // Method Generate random 2-digit PCM scores for students
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90); // Physics
            scores[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }
        return scores;
    }

    // Method Calculate total, average, percentage (rounded)
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method Calculate grade based on percentage
    public static String[] calculateGrades(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];

            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method Display scorecard in tabular format
    public static void displayScoreCard(
            int[][] scores,
            double[][] result,
            String[] grades
    ) {

        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generatePCMScores(n);
        double[][] result = calculateResults(scores);
        String[] grades = calculateGrades(result);

        displayScoreCard(scores, result, grades);

        sc.close();
    }
}
