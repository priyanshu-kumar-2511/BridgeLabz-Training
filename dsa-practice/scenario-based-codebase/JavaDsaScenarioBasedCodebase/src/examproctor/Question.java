package examproctor;

public class Question {
    int id;
    String text;
    String[] options;
    String correct;

    public Question(int id, String text, String[] options, String correct) {
        this.id = id;
        this.text = text;
        this.options = options;
        this.correct = correct;
    }
}
