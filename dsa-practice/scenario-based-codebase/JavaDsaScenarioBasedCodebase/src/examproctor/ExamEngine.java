package examproctor;

import java.util.*;

public class ExamEngine {

    private List<Question> questions = new ArrayList<>();
    private Stack<Integer> navigation = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();

    public ExamEngine() {
        questions.add(new Question(1, "Java is?", new String[]{"A. Language", "B. OS", "C. Browser"}, "A"));
        questions.add(new Question(2, "JVM stands for?", new String[]{"A. Java Very Much", "B. Java Virtual Machine", "C. Just VM"}, "B"));
        questions.add(new Question(3, "int size?", new String[]{"A. 2 bytes", "B. 4 bytes", "C. 8 bytes"}, "B"));
    }

    public void startExam() {
        System.out.println("\nExam Started\n");

        for (Question q : questions) {
            showQuestion(q);
        }

        submit();
    }

    private void showQuestion(Question q) {
        navigation.push(q.id);

        System.out.println("Q" + q.id + ". " + q.text);
        for (String opt : q.options) {
            System.out.println(opt);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Your Answer: ");
        String ans = sc.nextLine().toUpperCase();

        answers.put(q.id, ans);
    }

    private void submit() {
        int score = calculateScore();
        System.out.println("\n📝 Exam Finished");
        System.out.println("Your Score: " + score + "/" + questions.size());
    }

    private int calculateScore() {
        int score = 0;
        for (Question q : questions) {
            if (q.correct.equals(answers.get(q.id))) {
                score++;
            }
        }
        return score;
    }
}
