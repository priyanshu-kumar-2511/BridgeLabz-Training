package examresult;

public class ExamType<T> {

    private T type;

    public ExamType(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}
