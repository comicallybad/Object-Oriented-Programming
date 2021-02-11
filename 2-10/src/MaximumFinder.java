import java.util.Scanner;
public class MaximumFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 floating point values separated by spaces: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		double result = maximum(num1, num2, num3);
		
		System.out.printf("Maximum is: " + result);
		
		
		input.close();
	}
	
	public static double maximum(double num1, double num2, double num3) {
		double maxVal = num1;
		
		if(num2 > maxVal) maxVal = num2;
		if(num3 > maxVal) maxVal = num3;
		
		
		return maxVal;
	}
}
