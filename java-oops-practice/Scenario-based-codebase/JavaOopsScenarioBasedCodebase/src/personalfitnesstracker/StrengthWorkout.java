package personalfitnesstracker;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super(duration);
        this.type = "Strength";
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.07;  // burns less than cardio
    }
}
