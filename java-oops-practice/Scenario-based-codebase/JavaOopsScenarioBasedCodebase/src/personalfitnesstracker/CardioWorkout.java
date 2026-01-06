package personalfitnesstracker;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super(duration);
        this.type = "Cardio";
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.1;   // cardio burns more
    }
}

