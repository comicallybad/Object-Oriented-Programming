//John Seredick 4/15/2021

//This program will create 2 types of content creators. There will be a youtuber and streamer.
//Both classes will have a channelName, platform, then earnings, and schedule as abstract methods
//This program will create multiple content creators and print them out, modify them, and print them out again.
public class HW9Test {

	public static void main(String[] args) {
		//Create our 2 content creators
		YouTuber ComicallyBad = new YouTuber("ComicallyBad", "YouTube", 150, 1000000, 0.0000025, "every other day");
		TwitchStreamer Silvrbackrl = new TwitchStreamer("Silvrbackrl", "Twitch", 50, 2.5, "once a week");
		
		//Print our two content creators
		System.out.println(ComicallyBad);
		System.out.println(Silvrbackrl);
		
		System.out.println();
		
		//Modify our two content creators
		ComicallyBad.setVideoCount(175);
		ComicallyBad.setViewCount(2000000);
		Silvrbackrl.setSubscriberCount(75);
		Silvrbackrl.setSchedule("Twice a week");
		
		//Print our two content creators
		System.out.println(ComicallyBad);
		System.out.println(Silvrbackrl);
	}

}
