package personalfitnesstracker;

public class UserProfile {
    private String name;
    private int age;
    private double weight;      // protected health data
    private double dailyGoal;   // calorie goal

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = 2000;  // default
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, double dailyGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = dailyGoal;
    }

    public double getDailyGoal() {
        return dailyGoal;
    }

    // No setter for weight → protected
    public double getWeight() {
        return weight;
    }
}
