package com.linkedlist.doublylinkedlist.texteditor;

public class TextState {
    String text;
    TextState prev;
    TextState next;

    TextState(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

