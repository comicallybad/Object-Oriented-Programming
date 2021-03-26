//This class will be our super class in which other classes extend
public class Animal {
	//Each animal has a weight and height so we declare those variables in our super class
	private final int weight;
	private final int height;
	
	//Create our SUPER class essentially
	public Animal(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	//Return weight
	public int getWeight() {
		return this.weight;
	}
	//Return height
	public int getHeight() {
		return this.height;
	}
	//Override our toString method
	@Override
	public String toString() {
		return String.format("I'm an animal weighing: %dlbs with a height of: %dinches%n", getWeight(), getHeight());
	}
}
