import java.util.Scanner;

public class HW3BeerAssignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numBeers;
		double beerCost;
		
		System.out.print("On average, how many beers will you consume each day?\n");
		numBeers = input.nextDouble();
		
		while(numBeers < 0.0)
		{
			System.out.print("Please enter a positive number: \n");
			numBeers = input.nextDouble();
		}
		
		System.out.print("On average, how much will you pay for each can of beer?\n");
		beerCost = input.nextDouble();
		
		while(beerCost < 0.0)
		{
			System.out.print("Please enter a positive number: \n");
			beerCost = input.nextDouble();
		}
		
		System.out.printf("That is approximately %.2f beers in one year.\n", numBeers * 365.0);
		
		System.out.printf("In one year, you will consume approximately %.2f calories from beer alone.\n", numBeers * 150.0 * 365.0);
		
		System.out.printf("Without diet or exercise to counter these calories, you can expect to gain 37.50 pounds from drinking that much beer this year.\n", numBeers * 15);
		
		System.out.printf("Drinking %.2f beers a day at $%.2f each will cost you $%.2f per year.", numBeers, beerCost, numBeers * beerCost * 365.0);
		
		input.close();
	}

}
