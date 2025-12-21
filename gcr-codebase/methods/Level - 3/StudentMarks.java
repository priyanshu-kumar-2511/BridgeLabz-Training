import java.util.Scanner;

public class StudentMarks {

    // creating method to generate random PCM marks for students
    public static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10; 
            scores[i][2] = (int)(Math.random() * 90) + 10; 
        }
        return scores;
    }

    // creating method to calculate total, average and percentage
    // column 0 = total, 1 = average, 2 = percentage
    public static double[][] calculateResult(int[][] scores) {

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

    // creating method to find grade based on percentage
    public static String getGrade(double percentage) {

        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // creating method to display scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] result) {

        System.out.println("Std\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                getGrade(result[i][2])
            );
        }
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResult(scores);

        displayScoreCard(scores, result);

        sc.close();
    }
}
