package bankmanagementsystem;

public class Customer {
    String name;
    int id;
    Account account;

    Customer(String name, int id, Account account) {
        this.name = name;
        this.id = id;
        this.account = account;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + id);
        account.displayBalance();
    }
}
