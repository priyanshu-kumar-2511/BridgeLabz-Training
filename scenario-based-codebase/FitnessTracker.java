/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int days = 7;
        int[] pushUps = new int[days];

        System.out.println("=========================================");
        System.out.println("   SANDEEP'S 7-DAY FITNESS CHALLENGE");
        System.out.println("=========================================");
        System.out.println("Enter push-ups done each day");
        System.out.println("If it is a REST day, enter 0");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            pushUps[i] = sc.nextInt();
        }

        System.out.println("\n=========================================");
        System.out.println("         WEEKLY FITNESS REPORT");
        System.out.println("=========================================");

        int total = 0;
        int workoutDays = 0;

        for (int count : pushUps) {

            if (count == 0) {
                continue;   // skip rest day
            }

            total += count;
            workoutDays++;
        }

        double average = 0;
        if (workoutDays > 0) {
            average = (double) total / workoutDays;
        }

        System.out.println("Total Push-Ups (excluding rest days): " + total);
        System.out.println("Workout Days: " + workoutDays);
        System.out.println("Average Push-Ups per Workout Day: " + average);
        System.out.println("=========================================");
    }
}
