package functionalinterface.customfunctional;

/*Scenario 7: Custom Functional Interface

1.Create a custom functional interface to calculate bonus.

2.Create a custom functional interface to check loan eligibility.

3.Create a custom functional interface to calculate tax.

4.Create a custom functional interface to validate user login.*/

public class CustomFunctionalInterfaceScenario {

    /* 1️ Bonus Calculator Interface */

    @FunctionalInterface
    interface BonusCalculator {
        double calculateBonus(double salary, double performanceRating);
    }

    /* 2️ Loan Eligibility Interface */

    @FunctionalInterface
    interface LoanEligibilityChecker {
        boolean isEligible(double income, int creditScore);
    }

    /* 3️ Tax Calculator Interface */

    @FunctionalInterface
    interface TaxCalculator {
        double calculateTax(double income);
    }

    /* 4️ User Login Validator Interface */

    @FunctionalInterface
    interface LoginValidator {
        boolean validate(String username, String password);
    }

    public static void main(String[] args) {

        /* 1️ Calculate Bonus */

        BonusCalculator bonusCalculator = (salary, rating) -> salary * (rating / 10);

        double bonus = bonusCalculator.calculateBonus(50000, 8);
        System.out.println("Calculated Bonus: ₹" + bonus);

        /* 2️ Check Loan Eligibility */

        LoanEligibilityChecker loanChecker =(income, creditScore) -> income > 30000 && creditScore >= 700;

        boolean eligible = loanChecker.isEligible(45000, 720);
        System.out.println("Loan Eligible: " + eligible);

        /* 3️ Calculate Tax */

        TaxCalculator taxCalculator = income -> {
                    if (income <= 50000) return income * 0.10;
                    else if (income <= 100000) return income * 0.20;
                    else return income * 0.30;
                };

        double tax = taxCalculator.calculateTax(120000);
        System.out.println("Calculated Tax: ₹" + tax);

        /* 4️ Validate User Login */

        LoginValidator loginValidator =(username, password) ->
                        username.equals("admin") &&
                        password.equals("1234");

        boolean loginSuccess = loginValidator.validate("admin", "1234");

        System.out.println("Login Successful: " + loginSuccess);
    }
}
