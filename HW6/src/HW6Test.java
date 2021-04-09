//John Seredick 4/9/21

//This program will define 3 people using the name and person class
//This program will allow the user to change the fields for a person
//This program will output the data for all 3 people.
public class HW6Test {

	public static void main(String[] args) {
		Person person1 = new Person("John", "J", "Seredick", 'm', 21, 100000.00);
		Person person2 = new Person("Amy", "Bendix", 'f', 25, 550000.00);
		Person person3 = new Person("Mark", "Alein", "Zuckerberg", 'O', 36, 1000000000.00);

		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		person1.setMiddleName("");
		person1.setSalary(10000.99);
		person2.setMiddleName("Actress");
		person2.setAge(20);
		person3.setMiddleName("");
		person3.setGender('m');
		
		System.out.printf("%nAfter changes: %n%n");
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}

}
