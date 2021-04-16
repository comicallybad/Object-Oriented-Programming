//This will be our YouTuber class that implements our 3 interfaces and their methods
public class YouTuber implements Earnings, Subscribers, Comments {
	private String channelName;
	private int videoCount;
	private int avgNewSubscribersPerDay;
	private int avgViewsPerDay;
	private int avgCommentsPerDay;
	private double pricePerView;
	
	//Constructor for our YouTuber class
	public YouTuber(String channelName, int videoCount, int avgViewsPerDay, int avgNewSubscribersPerDay, int avgCommentsPerDay, double pricePerView) {
		this.channelName = channelName;
		if(videoCount <= 0)
			throw new IllegalArgumentException("Video Count must be greater than 0.");
		else this.videoCount = videoCount;
		if(avgViewsPerDay <= 0)
			throw new IllegalArgumentException("Average views per day must be greater than 0.");
		else this.avgViewsPerDay = avgViewsPerDay;
		if(avgNewSubscribersPerDay <= 0)
			throw new IllegalArgumentException("Average subscribers per day must be greater than 0.");
		else this.avgNewSubscribersPerDay = avgNewSubscribersPerDay;
		if(avgCommentsPerDay <= 0)
			throw new IllegalArgumentException("Average comments per day must be greater than 0.");
		else this.avgCommentsPerDay = avgCommentsPerDay;
		if(pricePerView <= 0)
			throw new IllegalArgumentException("Price per view must be greater than 0.");
		else this.pricePerView = pricePerView;
	}
	//set channelName
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	//Get channelName
	public String getChannelName() {
		return channelName;
	}
	//Set videoCount
	public void setVideoCount(int videoCount) {
		if(videoCount <= 0)
			throw new IllegalArgumentException("Video Count must be greater than 0.");
		else this.videoCount = videoCount;
	}
	//Get videoCount
	public int getVideoCount() {
		return videoCount;
	}
	//Set pricePerView
	public void setPricePerView(double pricePerView) {
		if(pricePerView <= 0)
			throw new IllegalArgumentException("Price per view must be greater than 0.");
		else this.pricePerView = pricePerView;
	}
	//Get pricePerView
	public double getPricePerView() {
		return pricePerView;
	}
	//Set avgViewsPerDay
	public void setavgViewsPerDay(int avgViewsPerDay) {
		if(avgViewsPerDay <= 0)
			throw new IllegalArgumentException("Average views per day must be greater than 0.");
		else this.avgViewsPerDay = avgViewsPerDay;
	}
	//Get avgViewsPerDay
	public int getAvgViewsPerDay() {
		return avgViewsPerDay;
	}
	//Set avgNewSubscribersPerDay
	public void setAvgNewSubscribersPerDay(int avgNewSubscribersPerDay) {
		if(avgNewSubscribersPerDay <= 0)
			throw new IllegalArgumentException("Average subscribers per day must be greater than 0.");
		else this.avgNewSubscribersPerDay = avgNewSubscribersPerDay;
	}
	//Get avgNewSubscribersPerDay
	public int getAvgNewSubscribersPerDay() {
		return avgNewSubscribersPerDay;
	}
	//Set avgCommentsPerDay
	public void setAvgCommentsPerDay(int avgCommentsPerDay) {
		if(avgCommentsPerDay <= 0)
			throw new IllegalArgumentException("Average comments per day must be greater than 0.");
		else this.avgCommentsPerDay = avgCommentsPerDay;
	}
	//get avgCommentsPerDay
	public int getAvgCommentsPerDay() {
		return avgCommentsPerDay;
	}
	
	//Here we will implement and override our Earnings interface
	
	//Override weeklyEarnings
	@Override
	public double weeklyEarnings() {
		return getVideoCount() * getPricePerView() * getAvgViewsPerDay() * 7;
	}
	//Override monthlyEarnings
	@Override
	public double monthlyEarnings() {
		return getVideoCount() * getPricePerView() * getAvgViewsPerDay() * 30;
	}
	//Override yearlyEarnings
	@Override
	public double yearlyEarnings() {
		return getVideoCount() * getPricePerView() * getAvgViewsPerDay() * 365;
	}
	
	//Here we will implement and override our Subscribers interface
	
	//Override weeklySubscriberIncrease
	@Override
	public int weeklySubscriberIncrease() {
		return avgNewSubscribersPerDay * 7;
	}
	//Override monthlySubscriberIncrease
	@Override
	public int monthlySubscriberIncrease() {
		return avgNewSubscribersPerDay * 30;
	}
	//Override yearlySubscriberIncrease
	@Override
	public int yearlySubscriberIncrease() {
		return avgNewSubscribersPerDay * 365;
	}
	
	//Here we will implement and override our Comments interface
	
	//Override weeklyComments
	@Override
	public int weeklyComments() {
		return avgCommentsPerDay * 7;
	}
	//Override monthlyComments
	@Override
	public int monthlyComments() {
		return avgCommentsPerDay * 30;
	}
	//Override yearlyComments
	@Override
	public int yearlyComments() {
		return avgCommentsPerDay * 365;
	}
	
	//Override toString
	@Override
	public String toString() {
		return String.format("%s's YouTube Statistics:%n"
				+ "Weekly Comments: %d%n"
				+ "Monthly Comments: %d%n"
				+ "Yearly Comments: %d%n%n"
				+ "Weekly Subscriber Increase: %d%n"
				+ "Monthly Subceriber Increase: %d%n"
				+ "Yearly Subscriber Increase: %d%n%n"
				+ "Weekly Earnings: $%.2f%n"
				+ "Monthly Earnings: $%.2f%n"
				+ "Yearly Earnings: $%.2f%n", 
				getChannelName(), weeklyComments(), monthlyComments(), yearlyComments(),
				weeklySubscriberIncrease(), monthlySubscriberIncrease(), yearlySubscriberIncrease(),
				weeklyEarnings(), monthlyEarnings(), yearlyEarnings());
	}
}
