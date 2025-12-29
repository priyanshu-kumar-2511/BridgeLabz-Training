/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

public class SchoolBusAttendance {

    public static void main(String[] args) {

        // List of student who register for bus
        String[] students = {"Rahul", "Amit", "Priyanshu", "Krishna", "Ankesh", "Anjali", "Abhishek", "Sneha", "Sakshi", "Surbhi"};

        int presentCount = 0;
        int absentCount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nGood Morining Students");
        System.out.println("I will call your name and you have to say Present sir, Otherwise your Attendance will mark Absent\n");
		

        for (String name : students) {
            System.out.print("Is " + name + " present in the bus? (P/A): ");
            char status = sc.next().toUpperCase().charAt(0);

            if (status == 'P') {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Creating Final Report
        System.out.println("\nBus Attendance Report");
        System.out.println("-------------------------------");
        System.out.println("Total Number of Students  : " + students.length);
        System.out.println("Total Students Present    : " + presentCount);
        System.out.println("Total Students Absent     : " + absentCount);

        sc.close();
    }
}
