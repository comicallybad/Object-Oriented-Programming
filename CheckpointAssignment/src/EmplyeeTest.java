
public class EmplyeeTest {

	public static void main(String[] args) {
		Employee account1 = new Employee("John", "Doe", 100.50);
		Employee account2 = new Employee("Jane", "Doe", 55.15);
		
		System.out.printf("%s %s %.2f\n", account1.getFirstName(), account1.getLastName(), account1.getSalary() * 12);
		System.out.printf("%s %s %.2f\n", account2.getFirstName(), account2.getLastName(), account2.getSalary() * 12);

		account1.setSalary(account1.getSalary() * 1.1);
		account2.setSalary(account2.getSalary() * 1.1);
		
		System.out.printf("%s %s %.2f\n", account1.getFirstName(), account1.getLastName(), account1.getSalary() * 12);
		System.out.printf("%s %s %.2f\n", account2.getFirstName(), account2.getLastName(), account2.getSalary() * 12);
	}

}
