
//This is our TwitchStreamer class that extends ContentCreator
public class TwitchStreamer extends ContentCreator {
	private int subscriberCount;
	private double pricePerSubscriber;
	private String schedule;
	
	//This is our constructor for our TwitchStreamer Content Creator
	public TwitchStreamer(String channelName, String platform, int subscriberCount, double pricePerSubscriber, String schedule) {
		super(channelName, platform);
		if(subscriberCount <= 0)
			throw new IllegalArgumentException("Subscriber count must be greater than 0.");
		else this.subscriberCount = subscriberCount;
		if(pricePerSubscriber <=0)
			throw new IllegalArgumentException("Price Per Subscriber must be greater than 0.");
		else this.pricePerSubscriber = pricePerSubscriber;
		this.schedule = schedule;
	}
	
	//Set subscriberCount
	public void setSubscriberCount(int subscriberCount) {
		if(subscriberCount <= 0)
			throw new IllegalArgumentException("Subscriber count must be greater than 0.");
		else this.subscriberCount = subscriberCount;
	}
	//Get subscriberCount
	public int getSubscriberCount() {
		return subscriberCount;
	}
	//Set pricePerSubscriber
	public void setPricePerSubscriber(double pricePerSubscriber) {
		if(pricePerSubscriber <=0)
			throw new IllegalArgumentException("Price Per Subscriber must be greater than 0.");
		else this.pricePerSubscriber = pricePerSubscriber;
	}
	//Get pricePerSubscriber
	public double getPricePerSubscriber() {
		return pricePerSubscriber;
	}
	//Set schedule
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	//Override the abstract methods declared in ContentCreator
	
	//Override earnings
	@Override
	public double earnings() {
		return pricePerSubscriber * subscriberCount;
	}
	//Override schedule
	@Override
	public String schedule() {
		return schedule;
	}
	//Override the toString method
	@Override
	public String toString() {
		return String.format("%s%nWith %d subscribers and $%.2f per subscriber, they have earned: $%.2f%nThey stream %s.%n",
				super.toString(), getSubscriberCount(),getPricePerSubscriber(), earnings(), schedule());
	}
}
