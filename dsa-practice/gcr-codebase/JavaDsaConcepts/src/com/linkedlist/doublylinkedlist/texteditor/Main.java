package com.linkedlist.doublylinkedlist.texteditor;

import java.util.Scanner;

/*8. Doubly Linked List: Undo/Redo Functionality for Text Editor
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
Hint:
Use a doubly linked list where each node represents a state of the text.
The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
Keep track of the current state and adjust the next and prev pointers for undo/redo operations.
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UndoRedoLinkedList manager = new UndoRedoLinkedList();

        while (true) {
            System.out.println("\n1 Type Text");
            System.out.println("2 Undo");
            System.out.println("3 Redo");
            System.out.println("4 Show Text");
            System.out.println("5 Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    manager.addState(sc.nextLine());
                    break;

                case 2:
                    manager.undo();
                    break;

                case 3:
                    manager.redo();
                    break;

                case 4:
                    manager.show();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}

