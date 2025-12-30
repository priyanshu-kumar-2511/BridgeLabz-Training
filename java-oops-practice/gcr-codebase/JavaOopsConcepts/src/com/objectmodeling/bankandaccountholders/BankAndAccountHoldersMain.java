package com.objectmodeling.bankandaccountholders;

public class BankAndAccountHoldersMain {
	public static void main(String[] args) {

        Bank hdfc = new Bank("HDFC Bank");
        Bank sbi = new Bank("SBI");

        Customer rahul = new Customer("Rahul");
        Customer priyanshu = new Customer("Priyanshu");

        Account a1 = hdfc.openAccount(rahul);
        Account a2 = sbi.openAccount(rahul);
        Account a3 = hdfc.openAccount(priyanshu);

        a1.deposit(5000);
        a2.deposit(3000);
        a3.deposit(8000);

        rahul.viewBalance();
        priyanshu.viewBalance();
    }
}
