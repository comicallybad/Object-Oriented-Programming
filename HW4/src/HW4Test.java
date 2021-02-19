import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

//This is the test class that will run the code in the main function
public class HW4Test {

	//This function will echo the first name 20 times
	public static void echoName(String firstName) {
		for(int i=1;i<=20;i++)
			System.out.printf("%s #%d ", firstName, i);
		System.out.printf("%n");
	}
	
	//This function will double the age provided and print it
	public static int doubleAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Only poisitive numbers are allowed!"); //Throw exception for negative input
		} else {
			return age*2;
		}
	}
	
	//This function will take an age input and tell whether they are a teen or not
	public static void isTeen(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Only poisitive numbers are allowed!"); //Throw exception for negative input
		} else {
			if(age >=10 && age < 20) System.out.printf("%nSince you are %d years old, you are a teen!%n", age);
			else if(age < 10) System.out.printf("%nSince you are %d years old, you are not a teen yet! You are almost there!%n", age);
			else if(age >=20) System.out.printf("%nSince you are %d years old, you are an adult now!%n", age);
		}
	}
	
	//This function will create a triangle of count rows, and output it to a triangle.txt file
	public static void createTriangle(int rows) {
		if(rows<0) {
			throw new IllegalArgumentException("Only poisitive numbers are allowed!"); //Throw exception for negative input
		} else {
			//Attempt to create file
		    try {
		        File createFile = new File("triangle.txt");
		        if (createFile.createNewFile()) {
		          System.out.println("File created: " + createFile.getName());
		        } else { //If the file already exists
		          System.out.println("File already exists.");
		        }
		      } catch (IOException e) { //Catch error creating file
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
			try {
				FileWriter file = new FileWriter("triangle.txt");
				//Algorithm for creating a triangle of count rows
				for (int i = 1; i <= rows; i++){
					for (int j = rows; j >= i; j--){
						System.out.print(" ");
						file.write(" ");
					}
					for (int j = 1; j <= i; j++){
						System.out.print("X ");
						file.write("X ");
					}
		         System.out.println();
		         file.write("\n");
		      }
				file.close();
		   } catch (IOException e){ //Catch error writing to file.
			   System.out.printf("An error occurred.");
			   e.printStackTrace();
		   }
		}
	}
	
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Secondary scanner so we don't mess up input scanner
		Scanner input2 = new Scanner(System.in);
		
		//Print out the menu
		System.out.printf("Please choose one of the following options:%n" 
		+ "Enter 1 to read a first name and echo it back 20 times.%n"
		+ "Enter 2 to read an age and double it.%n"
		+ "Enter 3 to read an age and output if you are a teenager or not.%n"
		+ "Enter 4 to read a single integer and create a triangle with integer count amount of rows.%n");

		//This keeps the program repeating
		while(input.hasNext()) {
			int choice = input.nextInt();
			
			//Variables for age, rows and name
			int age;
			int rows;
			String name;
			
			//Start switch case, have cases based on input # 1-4
			switch(choice) {
			
			//Echo first name 20 times
			case 1: 
				System.out.printf("%nPlease enter a first name: ");
				name = input2.nextLine();
				echoName(name);
				break;
			//Double age
			case 2:
				System.out.printf("%nPlease enter an age: ");
				age = input2.nextInt();
				try {
				age = doubleAge(age);
				System.out.printf("%nYour age doubled is: %d%n", age);
				}catch(IllegalArgumentException e) { //Catch invalid argument if age<0
					System.err.printf(e.getMessage());
				}
				break;
			//Check if user is a teen or not
			case 3:
				System.out.printf("%nPlease enter an age: ");
				age = input2.nextInt();
				try {
					isTeen(age);
				}catch(IllegalArgumentException e) { //Catch invalid argument if age<0
					System.err.printf(e.getMessage());
				}
				break;
			//Create triangle with row count
			case 4:
				System.out.printf("%nPlease enter an amount of rows for your triangle: ");
				rows = input2.nextInt();
				try {
					createTriangle(rows);
				}catch(IllegalArgumentException e) { //Catch invalid argument if rows<0
					System.err.printf(e.getMessage());
				}
				break;
			default:
				System.out.printf("Invalid option, Please enter a valid option!%n");
				break;
			}
		}
		input2.close();
		input.close();
	}
}
