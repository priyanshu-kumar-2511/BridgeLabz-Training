package loanapprovalautomation;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected double loanAmount;
    protected int term;
    protected double interestRate;

    private boolean approved;

    public LoanApplication(Applicant applicant, double loanAmount, int term, double interestRate) {
        this.applicant = applicant;
        this.loanAmount = loanAmount;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setApproval(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected double emiFormula() {
        double R = interestRate / (12 * 100);
        double N = term;
        return (loanAmount * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }
}

