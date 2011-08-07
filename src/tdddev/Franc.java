package tdddev;

public class Franc extends Money{

	public Franc(int amount, String currency) {
		super(amount, "CHF");
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

}
