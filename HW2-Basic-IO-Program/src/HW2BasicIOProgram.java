import java.util.Scanner;

public class HW2BasicIOProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nums[] = new int[3];
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			System.out.printf("Please enter number %d: ", i + 1);
			nums[i] = input.nextInt();
			sum += nums[i];
		}
		
		double average = sum/3;
		
		System.out.printf("The three numbers are: %d, %d, %d\nThe sum of all three numbers is: %d\nThe average of the three numbers is: %.2f", nums[0], nums[1], nums[2], sum, average);
		
		input.close();
	}
}
