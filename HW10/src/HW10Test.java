//John Seredick 4/16/21
//This program will create a YouTuber class
//The YouTuber class will have a channel name, videoCount, average subscribers per day, average views per day, average comments per day
//and average price per view
//The YouTuber class will make use of the Earnings, Subscribers, and Comments interfaces methods to calculate
//The YouTubers statistics for weekly, monthly, and yearly statistics

//This is our main class that will create our YouTuber, print out their information, modify their information, then print again
public class HW10Test {

	public static void main(String[] args) {
		//Create our YouTuber ComicallyBad
		YouTuber ComicallyBad = new YouTuber("ComicallyBad", 239, 2315, 10, 40, 0.0000025);
		
		//Print our YouTuber's statistics
		System.out.println(ComicallyBad);
		
		//Modify our YouTuber
		ComicallyBad.setavgViewsPerDay(4000);
		ComicallyBad.setAvgNewSubscribersPerDay(15);
		ComicallyBad.setAvgCommentsPerDay(75);
		
		System.out.printf("After modifications%n%n");
		
		//Print our YouTuber's statistics again
		System.out.println(ComicallyBad);
	}

}
