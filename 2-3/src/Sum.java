
public class Sum {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 3; i<=100;i+=2){
			total+=i;
			System.out.printf("%d ", i);
		}
		
		System.out.printf("Sum is %d\n", total);

	}

}
