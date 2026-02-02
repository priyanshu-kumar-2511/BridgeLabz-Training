package lambdaexpressions.schoolsystem;

/*Scenario 1: Student / School System

1.Use a lambda expression to print a welcome message for a student.

2.Use lambda to check if a student is pass or fail based on marks.

3.Sort students by name using lambda.

4.Sort students by rank using lambda.

5.Use lambda to display students whose age is above 18.*/

import java.util.*;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Priyanshu", 21, 80, 1));
		students.add(new Student("Sakshi", 20, 79, 2));
		students.add(new Student("Aman", 20, 35, 5));
		students.add(new Student("Ankesh", 18, 78, 3));
		students.add(new Student("Modi", 22, 76, 4));
		
		System.out.println("Welcome Messages");
		students.forEach(s -> System.out.println("Welcome, "+ s.getName()+ "!"));
		
		System.out.println("\nPass or Fail");
		students.forEach(s -> System.out.println(s.getName() +": "+ (s.getMarks() >= 40 ? "PASS" : "FAIL")));
		
		System.out.println("\nSorted by Name");
		students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		students.forEach(System.out::println);
		
		System.out.println("\nSorted by Rank");
		students.sort((s1, s2) -> Integer.compare(s1.getRank(), s2.getRank()));
		students.forEach(System.out::println);
		
		System.out.println("\nDisplay Students whose age is 18+");
		Predicate<Student> ageAbove18 = s -> s.getAge() > 18;
		students.stream().filter(ageAbove18).forEach(System.out::println);
		
	}
}
