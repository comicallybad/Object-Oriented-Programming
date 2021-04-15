
//This will be our super class that YouTuber and TwitchStreamer will extend
public abstract class ContentCreator {
	private String channelName;
	private String platform;
	
	//Constructor for our Super Class
	public ContentCreator(String channelName, String platform) {
		this.channelName = channelName;
		this.platform = platform;
	}
	//Set channelName
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	//Get channelName
	public String getChannelName(){
		return channelName;
	}
	//Set platform
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	//Get platform
	public String getPlatform() {
		return platform;
	}
	
	//Our two abstract methods
	
	//This abstract method will be to calculating earnings
	public abstract double earnings();
	
	//This abstract method will be used to return the schedule the content creator has
	public abstract String schedule();
	
	//Override toString method
	@Override
	public String toString() {
		return String.format("%s is a content creator on %s", getChannelName(), getPlatform());
	}
}
