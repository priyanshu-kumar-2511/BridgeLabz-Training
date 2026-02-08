package optionalclass.bankingsystem;

/*Scenario 3: 
1.Banking Application: A bank account may not have a nominee. Use Optional to handle this.
2.Fetch loan details of a customer if available.
3.If account balance is null, return minimum balance using Optional.
4.Safely fetch transaction reference number.
5.Display credit card details only if present.*/

public class Main {

    public static void main(String[] args) {

        CreditCard card = new CreditCard("1234-5678-9999", "12/28");

        BankAccount account1 = new BankAccount("ACC1001", null, null, card);
        BankAccount account2 = new BankAccount("ACC1002", "Priyanshu", 5000.0, null);

        Loan loan = new Loan("Home Loan", 500000.0);

        Customer customer1 = new Customer("Ankesh", loan);
        Customer customer2 = new Customer("Sakshi", null);

        Transaction txn1 = new Transaction("TXN78945");
        Transaction txn2 = new Transaction(null);

        BankingService service = new BankingService();

        /* Scenario Execution */

        System.out.println("Nominee: "+ service.getNominee(account1));
        System.out.println("Balance: Rs"+ service.getBalance(account1));
        System.out.println("Loan Details: "+ service.getLoanDetails(customer1));
        System.out.println("Transaction Ref: "+ service.getTransactionRef(txn2));
        System.out.println("\nCredit Card Details:");
        service.printCreditCard(account1);
    }
}
