package com.generics.mealplangenerator;

/*4. Personalized Meal Plan Generator
Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Meal Plan Generator =====");
            System.out.println("1. Vegetarian");
            System.out.println("2. Vegan");
            System.out.println("3. Keto");
            System.out.println("4. High Protein");
            System.out.println("5. Exit");
            System.out.print("Choose meal type: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 5) {
                System.out.println("Meal planning closed");
                return;
            }

            System.out.print("Enter user name: ");
            String name = sc.nextLine();

            Meal<?> meal = null;

            switch (choice) {
                case 1:
                    meal = MealGenerator.generateMeal(
                            name, new VegetarianMeal());
                    break;

                case 2:
                    meal = MealGenerator.generateMeal(
                            name, new VeganMeal());
                    break;

                case 3:
                    meal = MealGenerator.generateMeal(
                            name, new KetoMeal());
                    break;

                case 4:
                    meal = MealGenerator.generateMeal(
                            name, new HighProteinMeal());
                    break;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("\nPersonalized Meal Plan Created:");
            System.out.println(meal.getDetails());
        }
    }
}
