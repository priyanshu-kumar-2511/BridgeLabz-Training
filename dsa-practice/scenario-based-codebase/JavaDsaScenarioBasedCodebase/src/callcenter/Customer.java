package callcenter;

public class Customer {
    String number;
    String name;
    boolean vip;

    public Customer(String number, String name, boolean vip) {
        this.number = number;
        this.name = name;
        this.vip = vip;
    }

    public String toString() {
        return name + " (" + number + ")" + (vip ? " [VIP]" : "");
    }
}
