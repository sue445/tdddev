package tdddev;

public class Dollar extends Money{

	public Dollar(int amount, String currency) {
		super(amount, "USD");
	}

	@Override
	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

}
