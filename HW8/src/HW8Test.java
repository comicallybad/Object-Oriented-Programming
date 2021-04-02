//John Seredick 4/1/2021
//This program will make use of a Person class to create a new person.
//This program will then make use a Student class that extends our person class
//We will create a Person and then a Student and print them out.
//I made use of setter functions to change our students attributes and print it out again
//This is our main test class that will create people and students using their classes
public class HW8Test {

	public static void main(String[] args) {
		//Create a new person named jay hughes with 140 weight and 5.8 ft height
		Person jay = new Person("Jay", "Hughes", 140.0, 5.8);
		
		//Print out jay person
		System.out.println(jay);
		
		System.out.println();
		
		//Create new student john with gpa of 4.0 act score of 22 and 4 courses
		Student john = new Student("John", "Seredick", 150.0, 6.1, 4.0, 22, 4);
		
		//Print out john student
		System.out.println(john);
		
		//Change john's gpa, act score and number of courses
		john.setGPA(3.87);
		john.setActScore(23);
		john.setNumberOfCourses(5);
		
		System.out.println();
		
		//Print out john again with his new changed attributes
		System.out.println(john);
	}

}
