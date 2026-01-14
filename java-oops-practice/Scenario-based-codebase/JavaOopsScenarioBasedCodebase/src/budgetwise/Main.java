package budgetwise;

/*"BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).*/

import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Travel", 3000.0);

        Budget b = new MonthlyBudget(20000, limits);

        b.addTransaction(new Transaction(3000, "EXPENSE", LocalDate.now(), "Food"));
        b.addTransaction(new Transaction(4000, "EXPENSE", LocalDate.now(), "Travel"));
        b.addTransaction(new Transaction(1500, "EXPENSE", LocalDate.now(), "Food"));

        b.generateReport();
        b.detectOverspend();
    }
}
