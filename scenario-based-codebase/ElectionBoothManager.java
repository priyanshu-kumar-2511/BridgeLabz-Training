import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Priyanshu = 0, Sakshi = 0, Aman = 0;

        while (true) {
            System.out.print("\nEnter age of voter (-1 to stop): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Eligibility check
            if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            // Voting
            System.out.print("Vote (1-Priyanshu, 2-Sakshi, 3-Aman): ");
            int vote = sc.nextInt();

            if (vote == 1) {
                Priyanshu++;
                System.out.println("Vote recorded for Priyanshu.");
            } 
            else if (vote == 2) {
                Sakshi++;
                System.out.println("Vote recorded for Sakshi.");
            } 
            else if (vote == 3) {
                Aman++;
                System.out.println("Vote recorded for Aman.");
            } 
            else {
                System.out.println("Invalid vote!");
            }
        }

        System.out.println("\nElection Result --->");
        System.out.println("Priyanshu: " + Priyanshu + " votes");
        System.out.println("Sakshi: " + Sakshi + " votes");
        System.out.println("Aman: " + Aman + " votes");

        sc.close();
    }
}
