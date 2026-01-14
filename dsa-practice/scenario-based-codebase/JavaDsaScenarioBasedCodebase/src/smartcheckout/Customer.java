package smartcheckout;

import java.util.*;

public class Customer {
    String name;
    List<String> cart = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addItem(String itemName) {
        cart.add(itemName);
    }
}
