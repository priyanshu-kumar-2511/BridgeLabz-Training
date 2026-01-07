package virtualpetcare;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    public void feed() {
        changeHunger(-15);
        changeMood(+5);
    }

    public void play() {
        changeEnergy(-10);
        changeMood(+15);
    }

    public void sleep() {
        changeEnergy(+40);
        changeHunger(+5);
    }
}
