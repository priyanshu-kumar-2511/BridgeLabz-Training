package eduresults;

/*3. EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== Welcome To Edu Results System =====");
		List<List<Student>> districts = new ArrayList<>();
		
		System.out.print("Enter number of districts: ");
		int d = sc.nextInt();

        for (int i = 0; i < d; i++) {
            System.out.print("\nEnter number of students in District " + (i + 1) + ": ");
            int n = sc.nextInt();
            sc.nextLine();

            List<Student> district = new ArrayList<>();
            System.out.println("Enter students (sorted by marks DESC):");

            for (int j = 0; j < n; j++) {
                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                district.add(new Student(roll, name, marks));
            }

            districts.add(district);
        }

        List<Student> rankList = MergeSort.generateRankList(districts);

        System.out.println("\nState-wise Rank List:");
        int rank = 1;
        for (Student s : rankList) {
            System.out.println("Rank " + rank++ + " → " + s);
        }
	}
}
