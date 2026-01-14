package traincompanion;

public class Compartment {
    String name;
    String service;
    Compartment prev;
    Compartment next;

    public Compartment(String name, String service) {
        this.name = name;
        this.service = service;
    }
}
