//This is our super class Person which we will have a subclass of student
public class Person {
	//Create super class variables
	private final String firstName;
	private final String lastName;
	private final double weight;
	private final double height;
	
	//Create our super class essentially assign our first name, last name, weight and height
	public Person(String firstName, String lastName, double weight, double height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.height = height;
	}
	//Return first name
	public String getFirstName() {
		return firstName;
	}
	//Return last name
	public String getLastName() {
		return lastName;
	}
	//Return weight
	public double getWeight() {
		return weight;
	}
	//Return height
	public double getHeight() {
		return height;
	}
	//Override our toString method to print out our persons first and last name, and weight and height
	@Override
	public String toString() {
		return String.format("My name is: %s %s, I weigh: %.2f pounds and I am: %.2f ft tall.",
				getFirstName(), getLastName(),getWeight(), getHeight());
	}
}
