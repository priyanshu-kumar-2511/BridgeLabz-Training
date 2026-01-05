package com.stacksandqueues.circulartourproblem;

public class CircularTour {

    static int findStart(int[] petrol, int[] distance) {

        int totalPetrol = 0;
        int totalDistance = 0;
        int balance = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];

            balance += petrol[i] - distance[i];

            if (balance < 0) {
                // current start fails
                start = i + 1;
                balance = 0;
            }
        }

        if (totalPetrol < totalDistance)
            return -1;

        return start;
    }
}
