package personalizedlerningplatform;

public class Quiz {
	private String[] questions;
	private final String[] answers;
	private int score = 0;
	
	public int getTotalQuestions() {
	    return questions.length;
	}

	public String getQuestion(int index) {
	    return questions[index];
	}

	// Constructor Overloading
	public Quiz(String difficulty) {
		if(difficulty.equalsIgnoreCase("Easy")) {
		   questions = new String[] {"Full form of JVM ?", "Which keyword is used to inherit a class?", "Full form of OOp?"};
		   answers = new String[] {"Java Virtual Machine", "extends", "Object Oriented Programming"};  
		} else {  
			questions = new String[] {"Which memory area stores objects in Java?", "What is the default value of int in Java", "Which OOP concept is achieved using method overriding?"};
			answers = new String[] {"Heap", "0", "Polymorphism"};
		}
	}
	
	public void submitAnswers(String[] userAnswers) {
		for(int i=0;i<answers.length;i++) {
			if(userAnswers[i].equalsIgnoreCase(answers[i])) {
				score++;
			}
		}
	}
	
	public double getPercentage() {
		return (score * 100.0)/ answers.length;
	}
}
