
public class Dog extends Animal {
	private final String name;
	private final String breed;
	private final String DOB;
	
	public Dog(int weight, int height, String name, String breed, String DOB) {
		super(weight, height);
		this.name = name;
		this.breed = breed;
		this.DOB = DOB;
	}
	//Return name
	public String getName() {
		return name;
	}
	//Return breed
	public String getBreed() {
		return breed;
	}
	//Return DOB
	public String getDOB() {
		return DOB;
	}
	//Override toString method to include name, breed, DOB
	@Override
	public String toString() {
		return String.format("My name is: %s, my breed is: %s, and my date of birth is: %s%n", getName(), getBreed(), getDOB());
	}
}
