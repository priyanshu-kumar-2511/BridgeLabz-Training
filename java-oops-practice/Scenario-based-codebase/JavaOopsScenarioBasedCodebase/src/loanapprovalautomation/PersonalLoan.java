package loanapprovalautomation;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, double amount, int term) {
        super(applicant, amount, term, 14);
    }

    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 30000) {
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
