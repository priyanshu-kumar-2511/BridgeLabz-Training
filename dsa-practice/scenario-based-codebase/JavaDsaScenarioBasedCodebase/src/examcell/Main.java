package examcell;

/*5. ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExamCell cell = new ExamCell();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Exam Cell =====");
            System.out.println("1. Add Student Score");
            System.out.println("2. Generate Rank List");
            System.out.println("3. View Rank List");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter score: ");
                    int score = sc.nextInt();
                    cell.addStudent(name, score);
                    break;

                case 2:
                    cell.generateRankList();
                    break;

                case 3:
                    cell.showRankList();
                    break;

                case 4:
                    System.out.println("Exam Cell closed");
                    return;
            }
        }
    }
}
