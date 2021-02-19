
public class MethodOverload {

	public static void main(String[] args) {
		System.out.printf("Square integer 7 is %d%n", square(7));
		System.out.printf("Square double 7.5 is %f%n", square(7.5));
	}

	public static int square(int num) {
		System.out.printf("%nCalled square with int argument: %d", num);
		return num*num;
	}
	
	public static double square(double num) {
		System.out.printf("%nCalled square with double argument: %f", num);
		return num*num;
	}
	
}
