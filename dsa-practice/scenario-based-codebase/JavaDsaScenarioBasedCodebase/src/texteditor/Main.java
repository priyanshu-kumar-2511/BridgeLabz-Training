package texteditor;

import java.util.Scanner;

/*6. TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.*/

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 📝 Text Editor =====");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Text");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter text: ");
                    editor.insert(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter characters to delete: ");
                    editor.delete(sc.nextInt());
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.show();
                    break;

                case 6:
                    System.out.println("Editor closed");
                    return;
            }
        }
    }
}
