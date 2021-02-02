
public class StudentTest {

	public static void main(String[] args) {
		Student account1 = new Student("John Doe", 93.5);
		Student account2 = new Student("Jane Doe", 72.75);
		
		System.out.printf("Name: %s Average: %.2f Letter Grade: %s\n", account1.getName(), account1.getAverage(), account1.getLetterGrade());
		System.out.printf("Name: %s Average: %.2f Letter Grade: %s\n", account2.getName(), account2.getAverage(), account2.getLetterGrade());
	}

}
