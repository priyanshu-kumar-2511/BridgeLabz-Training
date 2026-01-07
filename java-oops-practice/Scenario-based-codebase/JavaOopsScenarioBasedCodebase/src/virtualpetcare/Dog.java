package virtualpetcare;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    public void feed() {
        changeHunger(-20);
        changeMood(+10);
    }

    public void play() {
        changeEnergy(-15);
        changeMood(+20);
        changeHunger(+10);
    }

    public void sleep() {
        changeEnergy(+30);
        changeHunger(+10);
    }
}
