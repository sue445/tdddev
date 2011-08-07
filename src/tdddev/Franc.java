package tdddev;

public class Franc extends Money{

	public Franc(int amount, String currency) {
		super(amount, "CHF");
	}

	@Override
	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
}
