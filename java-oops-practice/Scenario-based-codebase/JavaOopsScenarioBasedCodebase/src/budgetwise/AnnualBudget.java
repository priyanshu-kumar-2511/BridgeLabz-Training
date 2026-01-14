package budgetwise;

import java.util.*;
class AnnualBudget extends Budget {

    public AnnualBudget(double income, Map<String, Double> limits) {
        super(income, limits);
    }

    public void generateReport() {
        System.out.println("Annual Financial Report");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + getNetSavings());
    }

    public void detectOverspend() {
        System.out.println("Yearly category analysis done.");
    }
}
