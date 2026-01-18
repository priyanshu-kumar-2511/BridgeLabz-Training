package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {

    private String userName;
    private T mealPlan;

    public Meal(String userName, T mealPlan) {
        this.userName = userName;
        this.mealPlan = mealPlan;
    }

    public String getDetails() {
        return "User: " + userName +
               " | Meal Type: " + mealPlan.getMealType() +
               " | Calories: " + mealPlan.getCalories();
    }

    public T getMealPlan() {
        return mealPlan;
    }
}
