package com.linkedlist.doublylinkedlist.texteditor;

public class UndoRedoLinkedList{
    private TextState head;
    private TextState tail;
    private TextState current;

    private final int MAX = 10;
    private int size = 0;

    // Add 
    public void addState(String text) {

        TextState newNode = new TextState(text);

        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = countFromHead();
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode;
            size++;
        }

        if (size > MAX) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    // Undo
    public void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
        else
            System.out.println("Nothing to undo");
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null)
            current = current.next;
        else
            System.out.println("Nothing to redo");
    }

    // Display
    public void show() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
        else
            System.out.println("Empty");
    }

    // Recalculate the size
    private int countFromHead() {
        int c = 0;
        TextState temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
}

