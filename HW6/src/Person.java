//This class will create a person, making use of the name class
public class Person extends Name {
	//Define out 3 variables for person
	private char gender;
	private int age;
	private double salary;
	
	//Constructor for person with full name
	public Person(String firstName, String middleName, String lastName, char gender, int age, double salary) {
		super(firstName, middleName, lastName);

		if(Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F' || Character.toUpperCase(gender) == 'O')
			this.gender = Character.toUpperCase(gender);
		else {
			throw new IllegalArgumentException("Gender must be specified as M, F, or O");
		}
		if(age < 1 || age >120)
			throw new IllegalArgumentException("Age must be >= 1 and <= 120");
		else this.age = age;
		if(salary < 0.0)
			throw new IllegalArgumentException("Salary must be a positive number");
		else this.salary = salary;
	}
	//Constructor for person with no middle name
	public Person(String firstName, String lastName, char gender, int age, double salary) {
		super(firstName, lastName);
		if(Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F' || Character.toUpperCase(gender) == 'O')
			this.gender = Character.toUpperCase(gender);
		else {
			throw new IllegalArgumentException("Gender must be specified as M, F, or O");
		}
		if(age < 1 || age >120)
			throw new IllegalArgumentException("Age must be >= 1 and <= 120");
		else this.age = age;
		if(salary < 0.0)
			throw new IllegalArgumentException("Salary must be a positive number");
		else this.salary = salary;
	}
	//set gender
	public void setGender(char gender) {
		if(Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F' || Character.toUpperCase(gender) == 'O')
			this.gender = Character.toUpperCase(gender);
		else {
			throw new IllegalArgumentException("Gender must be specified as M, F, or O");
		}
	}
	//get gender
	public char getGender() {
		return gender;
	}
	//set age
	public void setAge(int age) {
		if(age < 1 || age >120)
			throw new IllegalArgumentException("Age must be >= 1 and <= 120");
		else this.age = age;

	}
	//get age
	public int getAge() {
		return age;
	}
	//set salary
	public void setSalary(double salary) {
		if(salary < 0.0)
			throw new IllegalArgumentException("Salary must be a positive number");
		else this.salary = salary;
	}
	//get salary
	public double getSalary() {
		return salary;
	}
	//Override toString
	@Override
	public String toString() {
		return String.format("%s, Gender: %c, Age: %d, Salary: %.2f", super.toString(), getGender(), getAge(), getSalary());
	}
}
