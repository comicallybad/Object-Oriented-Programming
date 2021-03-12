import java.util.Arrays;
import java.util.Scanner;

//This program will create an array of 100 random int's, print them out,
//Then sort them, print out in sorted order, prompt user to enter number between
//1 and 100 then display if that number is found or not,
//Then it will display each number from 1-100 and how many times that number is found
//It will display the average of the numbers in the array, the highest number and the lowest number
public class HW5Test {
	//This is our main function that will initialize the array and call the other functions
	public static void main(String[] args) {
		int array[] = new int [100];
		
		for(int i = 0; i<100; i++)
			array[i] = (int) ((Math.random()*100)+1);
		
		printArray(array);
		sortArray(array);
		printArray(array);
		searchArray(array);
		oneToOneHundred(array);
		average(array);
		highest(array);
		lowest(array);
	}
	//This function will print each element in the array
	public static void printArray(int array[]) {
		for(int i=0; i<100; i++) System.out.printf("%d, ", array[i]);
		System.out.printf("%n");
	}
	//This function will sort the array
	public static void sortArray(int array[]) {
		Arrays.sort(array);
	}
	//This function will ask for a number and attempt to locate that number in the array
	public static void searchArray(int array[]) {
		System.out.println("Please enter a number 1-100");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		int location = Arrays.binarySearch(array, num);
		
		if(location >= 0)
			System.out.printf("Found %d at element %d in array%n", num, location);
		else System.out.printf("%d not found in array.%n", num);
	}
	//This function will count 1-100 and say how many times that number is present within the array
	public static void oneToOneHundred(int array[]) {
		for(int i=1; i<=100; i++) {
			int count = 0;
			for(int j=0; j<100; j++) {
				if(array[j] == i) count++;
			}
			System.out.printf("%d: %d time(s)%n", i, count);
		}
	}
	//This function will display the average of all the numbers in the array
	public static void average(int array[]){
		int total=0;
		for(int i=0; i<100; i++) total+=array[i];
		total = total/100;
		System.out.printf("The average of all the numbers is: %d%n", total);
	}
	//This function will print the highest number in the array
	public static void highest(int array[]) {
		System.out.printf("The highest number in the array is: %d%n", array[array.length-1]);
	}
	//This function will print the lowest number in the array
	public static void lowest(int array[]) {
		System.out.printf("The lowest number in the array is: %d%n", array[0]);
	}
}
