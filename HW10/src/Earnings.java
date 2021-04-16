//This will be our earnings interface that defines functions for calculating weekly, monthly and yearly earnings
public interface Earnings {
	//Calculate weekly earnings
	public abstract double weeklyEarnings();
	//Calculate monthly earnings
	public abstract double monthlyEarnings();
	//Calculate yearly earnings
	public abstract double yearlyEarnings();
}
