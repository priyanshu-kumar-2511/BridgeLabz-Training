package homenest;

public class Main {
    public static void main(String[] args) {

        Device d1 = new Light("L1");
        Device d2 = new Camera("C1");
        Device d3 = new Thermostat("T1");
        Device d4 = new Lock("K1");

        d1.turnOn();
        d2.turnOn();
        d3.turnOn();
        d4.turnOn();

        d2.reset();
        d4.reset();

        System.out.println("\nEnergy Usage:");
        System.out.println("Light: " + d1.getEnergyUsage());
        System.out.println("Camera: " + d2.getEnergyUsage());
        System.out.println("Thermostat: " + d3.getEnergyUsage());
        System.out.println("Lock: " + d4.getEnergyUsage());
    }
}

