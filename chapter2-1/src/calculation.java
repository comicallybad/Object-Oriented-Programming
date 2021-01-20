//Addition.java
//Addition program that displays the sum of two numbers
import java.util.Scanner;

public class calculation {
	public static void main(String[] argsp) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();
		
		input.close();
		
		int sum = number1 + number2;
		
		System.out.printf("The sum of the two numbers is " + sum + "\n");
	}
	
}
