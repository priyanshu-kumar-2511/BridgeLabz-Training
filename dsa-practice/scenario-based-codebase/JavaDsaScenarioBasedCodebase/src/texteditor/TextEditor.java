package texteditor;

import java.util.Stack;

public class TextEditor {

    private StringBuilder content = new StringBuilder();
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    public void insert(String text) {
        content.append(text);
        undoStack.push(new Action("insert", text));
        redoStack.clear();      // new action kills redo history
        System.out.println("Inserted: " + text);
    }

    public void delete(int count) {
        if (count > content.length()) {
            System.out.println("Not enough characters to delete");
            return;
        }

        String removed = content.substring(content.length() - count);
        content.delete(content.length() - count, content.length());

        undoStack.push(new Action("delete", removed));
        redoStack.clear();
        System.out.println("Deleted: " + removed);
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action a = undoStack.pop();

        if (a.type.equals("insert")) {
            content.delete(content.length() - a.text.length(), content.length());
        } else {
            content.append(a.text);
        }

        redoStack.push(a);
        System.out.println("Undo successful");
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action a = redoStack.pop();

        if (a.type.equals("insert")) {
            content.append(a.text);
        } else {
            content.delete(content.length() - a.text.length(), content.length());
        }

        undoStack.push(a);
        System.out.println("Redo successful");
    }

    public void show() {
        System.out.println("📄 Current Text: " + content);
    }
}
