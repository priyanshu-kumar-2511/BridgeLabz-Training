package lambdaexpressions.banking;

public class Account {
	private String accountHolder;
	private double balance;
	
	public Account(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double setBalance(double balance) {
		return balance;
	}
	
	public String toString() {
		return ("Account Holder Name: "+ accountHolder +" | Balance: "+ balance);
	}
}
