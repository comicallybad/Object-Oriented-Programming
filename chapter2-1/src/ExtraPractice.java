import java.util.Scanner;

public class ExtraPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		System.out.println("Please enter the first integer");
		x = input.nextInt();
		System.out.println("Please enter the first integer");
		y = input.nextInt();
		System.out.println("Please enter the first integer");
		z = input.nextInt();
		
		input.close();
		
		System.out.printf("Product is: %d", calculateProduct(x,y,z));
	}
	
	public static int calculateProduct(int x, int y, int z) {
		int result = x*y*z;
		
		return result;
	}
}
