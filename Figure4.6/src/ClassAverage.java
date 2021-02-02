import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0;
		
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		
		while(grade != -1) {
			total += grade;
			gradeCounter++;
			
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		if(gradeCounter != 0) {			
			double average = (double) total/gradeCounter;
		
			System.out.printf("\nTotal of %d grades: %d\n", gradeCounter, total);
			System.out.printf("Class average: %.2f", average);
		} else {
			System.out.println("No grades were entered.");
		}
		
		
		input.close();
	}

}
