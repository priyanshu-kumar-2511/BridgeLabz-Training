package budgetwise;

import java.util.*;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, Map<String, Double> limits) {
        super(income, limits);
    }

    public void generateReport() {
        System.out.println("Monthly Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + getNetSavings());
    }

    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions)
            if (t.getType().equals("EXPENSE"))
                spent.put(t.getCategory(),
                        spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount());

        for (String cat : spent.keySet())
            if (spent.get(cat) > categoryLimits.get(cat))
                System.out.println("Overspend in " + cat);
    }
}
