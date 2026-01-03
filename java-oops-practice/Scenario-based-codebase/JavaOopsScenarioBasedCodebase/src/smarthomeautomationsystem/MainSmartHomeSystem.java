package smarthomeautomationsystem;


/*5. Smart Home Automation System
Scenario: Users can control appliances like lights, fans, ACs via a smart interface.
Concepts Used:
● Class: Appliance, Light, Fan, AC, UserController

Scenario-based Problems

● Constructor: Set default or user-defined power settings
● Access Modifiers: Internal device settings as private, toggle methods as public
● Interface: Controllable with methods turnOn(), turnOff()
● Operators: Compare energy usage (>, <, ==)
● OOP:
○ Encapsulation: Control internal appliance state
○ Abstraction: Devices follow common control interface
○ Inheritance: Device types inherit from Appliance
○ Polymorphism: Turning on a Light vs an AC involves different behaviors
*/
public class MainSmartHomeSystem {
    public static void main(String[] args) {

        Appliance light = new Light("L1");
        Appliance fan = new Fan("F1");
        Appliance ac = new AC("AC1");

        UserController controller = new UserController();

        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        controller.compareEnergy(ac, light);

        controller.controlDevice(ac, false);
    }
}
