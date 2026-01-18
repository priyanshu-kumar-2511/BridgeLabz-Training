package com.generics.mealplangenerator;

public class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(
            String userName, T mealPlan) {

        // validation logic
        if (mealPlan.getCalories() < 1500 || mealPlan.getCalories() > 2500) {
            throw new IllegalArgumentException("Invalid meal calorie range");
        }

        return new Meal<>(userName, mealPlan);
    }
}
