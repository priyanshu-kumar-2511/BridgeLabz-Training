package budgetwise;

import java.util.*;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions = new ArrayList<>();

    public Budget(double income, Map<String, Double> limits) {
        this.income = income;
        this.categoryLimits = limits;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double getTotalExpenses() {
        double sum = 0;
        for (Transaction t : transactions)
            if (t.getType().equals("EXPENSE"))
                sum += t.getAmount();
        return sum;
    }

    protected double getNetSavings() {
        return income - getTotalExpenses();   // operator usage
    }
}

