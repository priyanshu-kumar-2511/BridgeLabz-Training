package examproctor;

/*11. ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExamEngine exam = new ExamEngine();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Online Exam =====");
            System.out.println("1. Start Exam");
            System.out.println("2. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    exam.startExam();
                    return;
                case 2:
                    return;
            }
        }
    }
}
