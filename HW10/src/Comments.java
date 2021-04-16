//This will be our comments interface that defines functions for calculating weekly, monthly and yearly comments
public interface Comments {
	//Calculate weekly comments
	public abstract int weeklyComments();
	//Calculate monthly comments
	public abstract int monthlyComments();
	//Calculate yearly comments
	public abstract int yearlyComments();
}
