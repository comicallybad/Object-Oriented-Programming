//This is our Student class that will extend person to add GPA actScore and number of courses
public class Student extends Person {
	private double GPA;
	private int actScore;
	private int numberOfCourses;
	
	//Create our student by using super to set first and last name, and weight and height.
	//Then it will assaign GPA, actScore and numberOfCourses which are Student attributes
	public Student(String firstName, String lastName, double weight, double height, 
			double GPA, int actScore, int numberOfCourses) {
		super(firstName, lastName, weight, height);
		this.GPA = GPA;
		this.actScore = actScore;
		this.numberOfCourses = numberOfCourses;
	}
	//Set GPA
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	//Get GPA
	public double getGPA() {
		return GPA;
	}
	//Set actScore
	public void setActScore(int actScore) {
		this.actScore = actScore;
	}
	//Get actScore
	public int getActScore() {
		return actScore;
	}
	//Set numberOfCourses
	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}
	//Get numberOfCourses
	public int getNumberOfCourses() {
		return numberOfCourses;
	}
	//Override toString method we will actually use the getFirstName, getLastName, getWeight, getHeight from
	//the super class Person by using super.  This way we can print out the person as a normal person, but add a new line
	//to show all of their student attributes as well.
	@Override
	public String toString() {
		return String.format("My name is: %s %s, I weigh: %.2f pounds and I am: %.2f ft tall."
				+ "%nI am a student with a: %.2f GPA, I have a: %d ACT Score, and I am in: %d classes.",
				super.getFirstName(), super.getLastName(),super.getWeight(), super.getHeight(),
				getGPA(), getActScore(), getNumberOfCourses());
	}
}
