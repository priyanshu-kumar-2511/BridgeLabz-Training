package addressbook;

/*Address Book System
OOP Concepts:
Classes, Objects, Encapsulation, Constructors, Access Modifiers, Collections
Scenario:
You’ve been hired by DigiContact Pvt. Ltd., a startup creating digital tools for managing
contacts and relationships. They want a simple but robust Address Book application.
Each Contact should include:
● First Name, Last Name
● Phone Number, Email
● Address (optional: City, State, Zip)
Problem Statement:
Develop a Java application that:
● Adds a new contact (with validation for duplicates)
● Edits an existing contact by name
● Deletes a contact by name
● Searches contacts by city or state
● Displays all contacts sorted alphabetically
● Stores contacts in an in-memory structure like ArrayList<Contact>
Use:
● Classes and constructors to initialize contacts
● Encapsulation for secure data access
● Optional use of composition (Address as a separate class)*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("\n===== DigiContact Address Book =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: {
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();

                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    Contact c = new Contact(
                            fn, ln, phone, email,
                            new Address(city, state, zip)
                    );

                    if (book.addContact(c)) {
                        System.out.println("Contact added");
                    } else {
                        System.out.println("Duplicate contact");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter full name to edit: ");
                    String name = sc.nextLine();

                    System.out.print("New Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("New Email: ");
                    String email = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    if (book.editContact(name, phone, email, new Address(city, state, zip))) {
                        System.out.println("Contact updated");
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter full name to delete: ");
                    String name = sc.nextLine();

                    if (book.deleteContact(name)) {
                        System.out.println("Contact deleted");
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter city or state: ");
                    String loc = sc.nextLine();
                    book.searchByLocation(loc);
                    break;
                }

                case 5:
                    book.displayAll();
                    break;

                case 6:
                    System.out.println("Address Book closed");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
