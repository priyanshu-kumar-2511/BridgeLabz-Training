package com.stacksandqueues.circulartourproblem;

/*Circular Tour Problem
Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
*/

public class Main {

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = CircularTour.findStart(petrol, distance);

        System.out.print("Minimum petrol is needed to the next petrol pump: "+ start);
    }
}
