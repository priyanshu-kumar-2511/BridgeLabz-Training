package icecreamrush;

import java.util.*;

public class IceCreamShop {
	private List<Flavor> flavors = new ArrayList<>();
	
	public void addFlavor(String name, int sold) {
		flavors.add(new Flavor(name, sold));
		System.out.println("Flavor added");
	}
	
	public void sortByPopularity() {
	    int n = flavors.size();

	    for (int i = 0; i < n - 1; i++) {
	        boolean swapped = false;

	        for (int j = 0; j < n - i - 1; j++) {
	            if (flavors.get(j).soldCount < flavors.get(j + 1).soldCount) {

	                Flavor temp = flavors.get(j);
	                flavors.set(j, flavors.get(j + 1));
	                flavors.set(j + 1, temp);

	                swapped = true;
	            }
	        }

	        if (!swapped) break;
	    }

	    System.out.println("Flavors sorted by popularity");
	}	
		
	public void showFlavors() {	
		if (flavors.isEmpty()) {
            System.out.println("No flavor data available");
            return;
        }

        System.out.println("\nWeekly Popularity Report:");
        for (Flavor f : flavors) {
            System.out.println(f.name + " → Sold: " + f.soldCount);
        }
	}
}
