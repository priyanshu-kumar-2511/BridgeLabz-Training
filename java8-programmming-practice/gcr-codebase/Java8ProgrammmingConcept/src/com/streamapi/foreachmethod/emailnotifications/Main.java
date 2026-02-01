package com.streamapi.foreachmethod.emailnotifications;

/*4. Email Notifications
Given a list of user emails, use forEach() to send a notification email to each user.
emails.forEach(email -> sendEmailNotification(email));*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "ravi@gmail.com",
                "anita@gmail.com",
                "karan@gmail.com"
        );
        emails.forEach(email -> sendEmailNotification(email));
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Sending notification to: " + email);
    }
}
