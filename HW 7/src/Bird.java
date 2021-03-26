
public class Bird extends Animal {
	private final int wingSpan;
	private final boolean canFly;
	
	public Bird(int weight, int height, int wingSpan, boolean canFly) {
		super(weight, height);
		this.wingSpan = wingSpan;
		this.canFly = canFly;
	}
	//Return wing span
	public int getWingSpan() {
		return wingSpan;
	}
	//Return canFly
	public boolean getCanFly() {
		return canFly;
	}
	//Override toString method to include name, breed, DOB
	@Override
	public String toString() {
		return String.format("My wing span is: %d, I %s fly%n", getWingSpan(), getCanFly() ? "can" : "cannot");
	}
}
