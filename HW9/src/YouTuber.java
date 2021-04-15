
//This is our YouTuber class that extends ContentCreator
public class YouTuber extends ContentCreator {
	private int videoCount;
	private int viewCount;
	private double pricePerView;
	private String schedule;
	
	//This is our constructor for our YouTuber Content Creator
	public YouTuber(String channelName, String platform, int videoCount, int viewCount, double pricePerView, String schedule) {
		super(channelName, platform);
		if(videoCount <= 0)
			throw new IllegalArgumentException("Video count must be greater than 0.");
		else this.videoCount = videoCount;
		if(viewCount <= 0)
			throw new IllegalArgumentException("View count must be greater than 0.");
		else this.viewCount = viewCount;
		if(pricePerView <=0)
			throw new IllegalArgumentException("Price Per view must be greater than 0.");
		else this.pricePerView = pricePerView;
		this.schedule = schedule;
	}
	
	//Set videoCount
	public void setVideoCount(int videoCount) {
		if(videoCount <= 0)
			throw new IllegalArgumentException("Video count must be greater than 0.");
		else this.videoCount = videoCount;
	}
	//Get subscriberCount
	public int getVideoCount() {
		return videoCount;
	}
	//Set viewCount
	public void setViewCount(int viewCount) {
		if(viewCount <= 0)
			throw new IllegalArgumentException("View count must be greater than 0.");
		else this.viewCount = viewCount;
	}
	//Get view count
	public int getViewCount() {
		return viewCount;
	}
	//Set pricePerSubscriber
	public void setPricePerView(double pricePerView) {
		if(pricePerView <=0)
			throw new IllegalArgumentException("Price per view must be greater than 0.");
		else this.pricePerView = pricePerView;
	}
	//Get pricePerSubscriber
	public double getPricePerView() {
		return pricePerView;
	}
	//Set schedule
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	//Override the abstract methods declared in ContentCreator
	
	//Override earnings
	@Override
	public double earnings() {
		return pricePerView * (viewCount * videoCount);
	}
	//Override schedule
	@Override
	public String schedule() {
		return schedule;
	}
	//Override the toString method
	@Override
	public String toString() {
		return String.format("%s%nWith %d videos, %d views, and $%.7f per view, they have earned: $%.2f%nThey upload videos %s.%n",
				super.toString(), getVideoCount(), getViewCount(), getPricePerView(), earnings(), schedule());
	}
}
