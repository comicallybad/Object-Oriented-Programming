//This will be our subscribers interface that defines functions for calculating weekly, monthly and yearly subscriber increase
public interface Subscribers {
	//Calculate weekly subscriber increase
	public abstract int weeklySubscriberIncrease();
	//Calculate monthly subscriber increase
	public abstract int monthlySubscriberIncrease();
	//Calculate yearly subscriber increase
	public abstract int yearlySubscriberIncrease();
}
