package loanapprovalautomation;

public class Applicant {
    private String name;
    private int creditScore;
    private double income;

    public Applicant(String name, int creditScore, double income) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    int getCreditScore() {
        return creditScore;
    }

    double getIncome() {
        return income;
    }
}
