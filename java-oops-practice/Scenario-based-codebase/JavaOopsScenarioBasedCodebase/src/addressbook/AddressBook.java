package addressbook;

import java.util.*;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    // Add contact (prevent duplicates)
    public boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    // Edit contact
    public boolean editContact(String name, String phone, String email, Address address) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.update(phone, email, address);
                return true;
            }
        }
        return false;
    }

    // Delete contact
    public boolean deleteContact(String name) {
        return contacts.removeIf(
                c -> c.getFullName().equalsIgnoreCase(name)
        );
    }

    // Search by city or state
    public void searchByLocation(String location) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(location) ||
                c.getAddress().getState().equalsIgnoreCase(location)) {

                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found");
        }
    }

    // Display sorted contacts
    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty");
            return;
        }

        contacts.sort(
            Comparator.comparing(Contact::getFullName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\nAll Contacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
