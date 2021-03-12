//John Seredick 3/12/2021

//This program will ask you to add a student and add n amount of test scores
//This program will then display the exam average by student ID
//This program will then display the exams average by exam
//This program will then display the class average for all exams

import java.util.Scanner;

public class JaggedArrayTest {
	//Main function to start switch case to call other functions
	public static void main(String[] args) {
		double studentScores[][] = new double[25][];
		String studentNames[] = new String[25];
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Secondary scanner so we don't mess up input scanner
		Scanner input2 = new Scanner(System.in);
		//Initialize studentCount
		int studentCount = 0;
		
		//Print out the menu
		printMenu();
		
		//This keeps the program repeating
		while(input.hasNext()) {
			int choice = input.nextInt();
			
			//Variables for count student
			
			//Start switch case, have cases based on input # 1-4
			switch(choice) {
			
			//Add student
			case 1: 
				System.out.printf("%nPlease enter a first name: ");
				studentNames[studentCount] = input2.nextLine();
				addStudent(studentScores, studentNames, studentCount, input2);
				studentCount++;
				break;
			//display average for all exams by each student ID
			case 2:
				System.out.println();
				studentAverage(studentScores, studentNames, studentCount);
				break;
			//display average for each exam by exam number
			case 3:
				System.out.println();
				examAverage(studentScores, studentCount);
				//Case 3
				break;
			//display the class average
			case 4:
				System.out.println();
				classAverage(studentScores, studentCount);
				break;
			default:
				System.out.printf("Invalid option, Please enter a valid option!%n");
				break;
			}
		}
		input2.close();
		input.close();
	}
	//This function will print the menu
	public static void printMenu() {
		System.out.printf("Please choose one of the following options:%n" 
		+ "Enter 1 to Add a new student and their grades.%n"
		+ "Enter 2 to display the average for all exams by each student ID.%n"
		+ "Enter 3 to display the average for each exam by exam number.%n"
		+ "Enter 4 to display the class average.%n"
		+ "Enter ctrl+z to close the program.%n");
	}
	//Add a new student
	public static void addStudent(double studentScores[][], String studentNames[], int studentCount, Scanner input) {
		System.out.printf("Please enter an amount of test scores you wish to enter: ");
		int exams = input.nextInt();
		
		//Make sure that exam amount is greater than 0
		while(exams == 0) {
			System.out.printf("Number of exams must be greater than 0, please retry: ");
			exams = input.nextInt();
		}
		
		//Set studentScores array for the student and add 1 so we can add an ID at first index
		studentScores[studentCount] = new double [exams+1];
		//Assign student ID at first element of array
		studentScores[studentCount][0] = studentCount + 1;
		
		//Ask for input for n amount of tests
		for(int i=1; i<exams+1; i++) {
			System.out.printf("Enter test score #%d: ", i);
			studentScores[studentCount][i] = input.nextDouble();
			while(studentScores[studentCount][i] < 0.0 || studentScores[studentCount][i] > 100.0) {
				System.out.printf("Please retry, score must be greater or equal to 0 or less than or equal to 100%nEnter test score #%d: ", i);
				studentScores[studentCount][i] = input.nextDouble();
			}
		}
		
		//Print out that the student was added to the array as well as show their exam scores
		for(int i=0; i<exams+1; i++) {
			if(i == 0 ) System.out.printf("%nAdded %s ID %d: ", studentNames[studentCount], (int)studentScores[studentCount][i]);
			else System.out.printf("%.2f ", studentScores[studentCount][i]);
			System.out.printf("%n");
		}
		//Print new line and return to menu
		System.out.printf("%n");
		input.nextLine();
		printMenu();
	}
	//This function will display the exam average by student
	public static void studentAverage(double studentScores[][], String studentNames[], int studentCount) {
		//Loop through each student
		for(int i=0; i<studentCount;i++) {
			double total = 0;
			System.out.printf("Exam average by student %s ID %d: ", studentNames[i], (int)studentScores[i][0]);
			//Loop through each test score skipping the student ID at element 0
			for(int j=1; j<studentScores[i].length; j++) {
				total += studentScores[i][j];
			}
			//Compute average and output
			int numElements = studentScores[i].length-1;
			double average = total / numElements;
			System.out.printf("%.2f%n", average);
		}
		//Return to menu
		System.out.println();
		printMenu();
	}
	//This function will display the exam average by exam
	public static void examAverage(double studentScores[][], int studentCount) {
		//Find out maximum number of tests
		int max = 0;
		for(int i=0; i<studentCount; i++) {
			if(studentScores[i].length > max)
				max = studentScores[i].length-1;
		}
		//Loop through maximum number of tests
		for(int i = 1; i<=max; i++) {
			double total = 0;
			double count = 0;
			double average = 0;
			//Loop through each student
			for(int j=0; j<studentCount; j++) {
				if(studentScores[j].length > i) {
					total+=studentScores[j][i];
					count++;
				}
			}
			//Compute and print average
			average = total/count;
			System.out.printf("The average for test #%d is: %.2f%n", i, average);
		}
		//Return to menu
		System.out.println();
		printMenu();
	}
	//This function will display the current class average for all exams
	public static void classAverage(double studentScores[][], int studentCount) {
		//Loop through each student
		double total = 0;
		double count = 0;
		double average = 0;
		//Loop through each student
		for(int i=0; i<studentCount;i++) {
			//Loop through each test score skipping the student ID at element 0
			for(int j=1; j<studentScores[i].length; j++) {
				total += studentScores[i][j];
				count += 1;
			}
			//Compute average and output
			average = total / count;
		}
		//Print average and then return to menu
		System.out.printf("The class average is: %.2f%n", average);
		System.out.println();
		printMenu();
	}
}
