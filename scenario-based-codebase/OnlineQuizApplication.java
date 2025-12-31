/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class OnlineQuizApplication {

        // ================= HTML QUIZ =================
    static void startHTMLQuiz() {

        String[] questions = {
                "HTML stands for?",
                "Which tag is used for line break?",
                "Which tag inserts image?",
                "HTML is?",
                "Which tag makes text bold?"
        };

        String[][] options = {
                {"A. Hyper Text Markup Language", "B. High Text Machine Language", "C. Hyper Tool Multi Language", "D. None"},
                {"A. <p>", "B. <br>", "C. <hr>", "D. <h1>"},
                {"A. <img>", "B. <src>", "C. <image>", "D. <pic>"},
                {"A. Programming Language", "B. Markup Language", "C. Database", "D. OS"},
                {"A. <b>", "B. <bold>", "C. <strong>", "D. <text>"}
        };

        char[] answers = {'A', 'B', 'A', 'B', 'A'};

        runQuiz(questions, options, answers);
    }

    // ================= JAVA QUIZ =================
    static void startJavaQuiz() {

        String[] questions = {
                "Java is?",
                "Which keyword creates object?",
                "Which is main method?",
                "Keyword for inheritance?",
                "Which is not data type?"
        };

        String[][] options = {
                {"A. OS", "B. Programming Language", "C. Browser", "D. DB"},
                {"A. new", "B. make", "C. create", "D. build"},
                {"A. main()", "B. start()", "C. run()", "D. init()"},
                {"A. this", "B. super", "C. extends", "D. implements"},
                {"A. int", "B. float", "C. double", "D. string"}
        };

        char[] answers = {'B', 'A', 'A', 'C', 'D'};

        runQuiz(questions, options, answers);
    }

    // ================= PYTHON QUIZ =================
    static void startPythonQuiz() {

        String[] questions = {
                "Python is?",
                "Which symbol is for comments?",
                "Which keyword defines function?",
                "Python file extension?",
                "Which is correct variable?"
        };

        String[][] options = {
                {"A. OS", "B. Language", "C. Browser", "D. App"},
                {"A. //", "B. #", "C. /* */", "D. %"},
                {"A. function", "B. def", "C. fun", "D. define"},
                {"A. .java", "B. .py", "C. .html", "D. .exe"},
                {"A. 1num", "B. num1", "C. num-1", "D. @num"}
        };

        char[] answers = {'B', 'B', 'B', 'B', 'B'};

        runQuiz(questions, options, answers);
    }

    // ================= COMMON ENGINE =================
    static void runQuiz(String[] questions, String[][] options, char[] answers) {

        for (int i = 0; i < 5; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your Answer: ");
            char user = sc.next().toUpperCase().charAt(0);

            switch (user) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (user == answers[i]) {
                        score++;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
	
	
    static Scanner sc = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {

        System.out.println("====== ONLINE QUIZ ======");
        System.out.println("1. HTML");
        System.out.println("2. Core Java");
        System.out.println("3. Python");

        System.out.print("Choose Subject: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                startHTMLQuiz();
                break;
            case 2:
                startJavaQuiz();
                break;
            case 3:
                startPythonQuiz();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("\nFinal Score: " + score + " / 5");
		if(score==5){
			System.out.println("Congrats! All your answers are correct.");
        } else if(score >=3){
            System.out.println("Good job! You are doing well, but you can improve.");
        } else{
            System.out.println("You need improvement.");
        }			
    }
}
