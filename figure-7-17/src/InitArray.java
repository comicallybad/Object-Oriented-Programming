
public class InitArray {

	public static void main(String[] args) {
		int [][] array1 = {{1,2,3},{4,5,6}};
		int [][] array2 = {{1,2},{3},{4,5,6}};
		
		System.out.println("Values in array1 by row");
		outputArray(array1);
		
		System.out.println("Values in array2 by row");
		outputArray(array2);
	}

	public static void outputArray(int[][] array){
		for(int i=0; i<array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.println();
		}
	}
}
