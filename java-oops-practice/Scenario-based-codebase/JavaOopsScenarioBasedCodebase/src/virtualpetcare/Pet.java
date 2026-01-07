package virtualpetcare;

import java.util.Random;

public abstract class Pet implements IInteractable {
    protected String name;
	protected String type;
	protected int age;
	
	// Encapsulated state
	private int hunger;
	private int energy;
	private int mood;
	
	// Randomized constructor
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		
		Random r = new Random();
		this.hunger = r.nextInt(40)+30;
		this.energy = r.nextInt(40)+30;
		this.mood = r.nextInt(40)+30;
	}
	
	// Controlled access (no public setters)
	public int getHunger() {
		return hunger;
	}
	public int getEnergy() {
		return energy;
	}
	public int getMood() {
		return mood;
	}
	
	protected void changeHunger(int value) {
		hunger = Math.max(0,  Math.min(100,  hunger + value));
	}
	
	protected void changeEnergy(int value) {
		hunger = Math.max(0,  Math.min(100,  energy + value));
	}

	protected void changeMood(int value) {
		hunger = Math.max(0,  Math.min(100,  mood + value));
	}
	
	//----------------------------------
	public abstract void makeSound();

    public void showStatus() {
        System.out.println(name + " | Hunger: " + hunger + " | Energy: " + energy + " | Mood: " + mood);
    }
}
