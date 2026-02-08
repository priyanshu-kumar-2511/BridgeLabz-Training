package optionalclass.ecommercesystem;

public class Seller {

    private String name;
    private String contact;

    public Seller(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() { return name; }

    public String getContact() { return contact; }
}
