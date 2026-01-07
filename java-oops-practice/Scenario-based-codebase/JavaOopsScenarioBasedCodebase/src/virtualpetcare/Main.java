package virtualpetcare;

/*12. "PetPal – Virtual Pet Care App"
Story: You’re creating PetPal, an app that allows users to adopt and care for virtual pets like
dogs, cats, and birds.
Requirements:
● Pet base class: name, type, age.
● Derived classes: Dog, Cat, Bird (use inheritance).
● IInteractable interface with methods like feed(), play(), sleep().
● Encapsulation of hunger and mood levels.
● Use constructors to assign random default values or user-specified pets.
● Operators to increase/decrease energy, hunger based on interactions.
● Polymorphism: makeSound() behaves differently for each pet.
● Access modifiers ensure internal mood status is only modifiable through methods.
*/

public class Main {
	public static void main(String[] args) {

        Pet pet1 = new Dog("Bruno", 3);
        Pet pet2 = new Cat("Kitty", 2);
        Pet pet3 = new Bird("Tweety", 1);

        Pet[] pets = {pet1, pet2, pet3};

        for (Pet p : pets) {
            p.makeSound();     // POLYMORPHISM
            p.showStatus();

            p.play();
            p.feed();
            p.sleep();

            p.showStatus();
            System.out.println("---------------");
        }
    }
}
