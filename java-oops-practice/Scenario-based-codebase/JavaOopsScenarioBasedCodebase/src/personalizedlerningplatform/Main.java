package personalizedlerningplatform;
import java.util.*;

/*10. "EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.

Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.*/

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to The EduMentor – Personalized Learning Platform");
		
		Instructor instructor = new Instructor("Priyanshu Kumar", "kumarpriyanshu@gmail.com", "CD130");
		instructor.displayInfo();
        System.out.println("");
        
        // asking user to choose difficulty level of quiz
		System.out.println("Enter quiz difficulty : ");
		System.out.println("1. Easy \n2. Hard");
		String difficulty = sc.nextLine();

        Quiz quiz = instructor.createQuiz(difficulty);
        
        // User Name and Details
        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        Learner learner = new Learner(name, email, userId);

        // Taking answer from user of following questions
        System.out.println("\nAnswer the following questions: ");
        
        int total = quiz.getTotalQuestions();
        String[] userAnswers = new String[total];
        
        for(int i=0;i<total;i++) {
        	System.out.println("Q"+(i+1)+ ": "+ quiz.getQuestion(i));
        	userAnswers[i] = sc.nextLine();
        }
        quiz.submitAnswers(userAnswers);
        
        // calculating percentage and printing 
        double percent = quiz.getPercentage();
        System.out.println("\nScore: "+ percent +"%");
        
        learner.updateProgress(percent);
        
        // generating certificated on the basis of your choice and performance
        System.out.println( learner.generateCertificate(difficulty, percent) );
    
        sc.close();
        		
	}
}
