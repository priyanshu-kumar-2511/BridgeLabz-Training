package com.linkedlist.singlylinkedlist.socialmedia;

public class SocialMediaLinkedList{
    private UserNode head;

    // Add User
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newUser;
    }

    // Find User
    private UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    
    // Add Friend Connection
    public void addFriend(int u1, int u2) {

        UserNode user1 = findUser(u1);
        UserNode user2 = findUser(u2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendNode(user1, u2);
        addFriendNode(user2, u1);
    }

    private void addFriendNode(UserNode user, int friendId) {
        FriendNode newNode = new FriendNode(friendId);
        newNode.next = user.friends;
        user.friends = newNode;
    }

    // Remove Friend
    public void removeFriend(int u1, int u2) {
        removeFriendNode(findUser(u1), u2);
        removeFriendNode(findUser(u2), u1);
    }

    private void removeFriendNode(UserNode user, int friendId) {
        if (user == null) return;

        FriendNode temp = user.friends;

        if (temp != null && temp.friendId == friendId) {
            user.friends = temp.next;
            return;
        }

        while (temp != null && temp.next != null) {
            if (temp.next.friendId == friendId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
    
    // Mutual Friends
    public void mutualFriends(int u1, int u2) {
        UserNode user1 = findUser(u1);
        UserNode user2 = findUser(u2);

        FriendNode f1 = user1.friends;

        while (f1 != null) {
            FriendNode f2 = user2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.println("Mutual Friend ID: " + f1.friendId);
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }
    
    // Display Friends
    public void displayFriends(int id) {
        UserNode user = findUser(id);
        FriendNode temp = user.friends;

        System.out.print("Friends of " + user.name + ": ");
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    // Search By Name
    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                System.out.println(temp.userId + " " + temp.name);
            temp = temp.next;
        }
    }

    // Search By Id
    public void searchById(int id) {
        UserNode u = findUser(id);
        if (u != null)
            System.out.println(u.name + " " + u.age);
    }

    // Count Friends
    public void countFriends(int id) {
        UserNode user = findUser(id);
        int count = 0;
        FriendNode temp = user.friends;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println(user.name + " has " + count + " friends");
    }
}




