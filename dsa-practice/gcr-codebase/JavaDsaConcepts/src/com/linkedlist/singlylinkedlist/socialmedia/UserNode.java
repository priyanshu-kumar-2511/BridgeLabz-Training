package com.linkedlist.singlylinkedlist.socialmedia;

public class UserNode {
    int userId;
    String name;
    int age;

    FriendNode friends;   // head of friend list
    UserNode next;           // next user

    UserNode(int id, String name, int age) {
        this.userId = id;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

