import java.util.Scanner;

public class VoteEligibility {

    // Create method Take ages of n students and return 1D array

    public static int[] getStudentAges(int n, Scanner sc) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // Method Check voting eligibility
    // Returns 2D array -> { age, true/false }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; // invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }
        return result;
    }

    // Method Display 2D array in tabular format

    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("---\t--------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        int[] ages = getStudentAges(numberOfStudents, sc);
        String[][] votingResult = checkVotingEligibility(ages);
        displayResult(votingResult);

        sc.close();
    }
}
