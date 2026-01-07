package loanapprovalautomation;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, double amount, int term) {
        super(applicant, amount, term, 8);
    }

    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 50000) {
            setApproval(true);
        } else {
            setApproval(false);
        }
        return isApproved();
    }

    public double calculateEMI() {
        return emiFormula() * 0.95;
    }
}

