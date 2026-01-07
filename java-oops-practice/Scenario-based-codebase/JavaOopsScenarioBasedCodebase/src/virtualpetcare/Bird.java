package virtualpetcare;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }

    public void feed() {
        changeHunger(-10);
        changeMood(+10);
    }

    public void play() {
        changeEnergy(-20);
        changeMood(+20);
    }

    public void sleep() {
        changeEnergy(+25);
    }
}

