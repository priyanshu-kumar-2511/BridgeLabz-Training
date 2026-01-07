package loanapprovalautomation;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, double amount, int term) {
        super(applicant, amount, term, 10);
    }

    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 600 && applicant.getIncome() >= 25000) {
            setApproval(true);
        } else {
            setApproval(false);
        }
        return isApproved();
    }

    public double calculateEMI() {
        return emiFormula();
    }
}

