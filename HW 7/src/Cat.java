
public class Cat extends Animal {
	private final String name;
	private int lives;
	
	public Cat(int weight, int height, String name, int lives) {
		super(weight, height);
		this.name = name;
		this.lives = lives;
	}
	//Return name
	public String getName() {
		return name;
	}
	//Return breed
	public int getLives() {
		return lives;
	}
	//Return DOB
	public void setLives(int lives) {
		if(lives > 9 || lives < 0) throw new IllegalArgumentException("Lives must be greater than 9 and less than 0");
		else this.lives = lives;
	}
	//Override toString method to include name, breed, DOB
	@Override
	public String toString() {
		return String.format("My name is: %s, I have: %d lives left%n", getName(), getLives());
	}
}
