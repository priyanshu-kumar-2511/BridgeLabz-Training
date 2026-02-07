package functionalinterface.consumer;

/*Scenario 3: Consumer (Perform Action)

1.Print student details using Consumer.

2.Log employee login activity using Consumer.

3.Print order confirmation message using Consumer.

4.Display account balance using Consumer.

5.Send notification message using Consumer.*/

import java.time.LocalDateTime;
import java.util.function.Consumer;

public class ConsumerScenario {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }
    }

    static class Order {
        String orderId;
        double amount;

        Order(String orderId, double amount) {
            this.orderId = orderId;
            this.amount = amount;
        }
    }

    static class Account {
        String accountHolder;
        double balance;

        Account(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {

        /* 1️ Print student details */

        Student student = new Student("Priyanshu", 22);
        Consumer<Student> printStudent = s -> System.out.println("Student Name: " + s.name + ", Age: " + s.age);
        printStudent.accept(student);

        /* 2️ Log employee login activity */

        Employee employee = new Employee("Ankesh");
        Consumer<Employee> loginLogger = e -> System.out.println("\nEmployee " + e.name + " logged in at " + LocalDateTime.now());
        loginLogger.accept(employee);

        /* 3️ Print order confirmation */

        Order order = new Order("ORD130", 1500.0);
        Consumer<Order> orderConfirmation = o -> System.out.println("\nOrder " + o.orderId + " confirmed. Amount: ₹" + o.amount);
        orderConfirmation.accept(order);

        /* 4️ Display account balance */

        Account account = new Account("Sakshi", 25000.0);
        Consumer<Account> displayBalance = a -> System.out.println("\nAccount Holder: " + a.accountHolder + ", Balance: ₹" + a.balance);
        displayBalance.accept(account);

        /* 5️ Send notification message */

        Consumer<String> sendNotification = message -> System.out.println("\nNotification Sent: " + message);
        sendNotification.accept("Your payment was successful!");

        /* BONUS: Consumer Chaining */

        System.out.println("\n--- Consumer Chaining ---");
        Consumer<Student> printName = s -> System.out.println("Name: " + s.name);
        Consumer<Student> printAge = s -> System.out.println("Age: " + s.age);
        printName.andThen(printAge).accept(student);
    }
}
