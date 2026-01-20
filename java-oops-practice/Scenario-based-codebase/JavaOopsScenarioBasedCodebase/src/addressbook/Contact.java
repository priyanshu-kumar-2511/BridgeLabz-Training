package addressbook;

public class Contact {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;

    // Constructor
    public Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void update(String phone, String email, Address address) {
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return getFullName() +" | Phone: " + phone +" | Email: " + email +" | Address: " + address;
    }
}
