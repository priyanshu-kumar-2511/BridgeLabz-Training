package personalfitnesstracker;

/*11. "FitTrack – Your Personal Fitness Tracker"
Story: You’ve been hired to develop FitTrack, a fitness tracking app that monitors users'
workouts, calories, and daily progress.
Requirements:
● UserProfile class with fields like name, age, weight, goal.
● Workout class to track type, duration, caloriesBurned.
● Constructors to allow user creation with default or custom goals.
● ITrackable interface with startWorkout() and stopWorkout() methods.
● Use encapsulation to protect private health data (e.g., weight).
● Operators to compute calorie targets and progress (dailyTarget -
caloriesBurned).
● Inheritance: CardioWorkout, StrengthWorkout extend Workout.
● Polymorphism: calculateCalories() differs by workout type.
● Access modifiers to restrict internal workout logs from being exposed directly.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Welcome to FitTrack – Your Personal Fitness Tracker");
    	
    	System.out.println("User are requested to enter thier details");
    	System.out.print("Enter your name : ");
    	String name = sc.nextLine();
    	
    	System.out.print("Enter your age : ");
    	int age = sc.nextInt();

        System.out.print("Enter your weight : ");
        double weight = sc.nextDouble();

        System.out.print("Enter your daily goal of Calories : ");
        double dailyGoal = sc.nextDouble();
        
        UserProfile user = new UserProfile(name, age, weight, dailyGoal);

        System.out.print("Enter the duration of Cardio Workout : ");
        int duration = sc.nextInt();
        Workout workout = new CardioWorkout(duration);  // polymorphism

        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        double burned = workout.getCaloriesBurned();
        double remaining = user.getDailyGoal() - burned;

        System.out.println("Calories Burned: " + burned);
        System.out.println("Remaining Calories for Today: " + remaining);
    }
}
