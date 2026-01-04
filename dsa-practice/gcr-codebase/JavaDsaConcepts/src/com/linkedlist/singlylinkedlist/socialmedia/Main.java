package com.linkedlist.singlylinkedlist.socialmedia;

/*7. Singly Linked List: Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
Add a friend connection between two users.
Remove a friend connection.
Find mutual friends between two users.
Display all friends of a specific user.
Search for a user by Name or User ID.
Count the number of friends for each user.
Hint:
Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
For mutual friends, traverse both lists and compare the Friend IDs.
The List of Friend IDs for each user can be implemented as a nested linked list or array.
*/

public class Main{
    public static void main(String[] args) {

        SocialMediaLinkedList socialmedia = new SocialMediaLinkedList();

        socialmedia.addUser(1, "Rahul", 20);
        socialmedia.addUser(2, "Neha", 21);
        socialmedia.addUser(3, "Amit", 22);
        socialmedia.addUser(4, "Priyanshu", 23);

        socialmedia.addFriend(1, 2);
        socialmedia.addFriend(1, 3);
        socialmedia.addFriend(2, 3);
        socialmedia.addFriend(2, 4);

        socialmedia.displayFriends(2);
        socialmedia.mutualFriends(1, 2);
        socialmedia.countFriends(2);
    }
}

