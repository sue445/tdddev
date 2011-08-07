package tdddev;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() throws Exception {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testEquality() throws Exception {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(new Franc(5, null).equals(new Franc(5, null)));
		assertFalse(new Franc(5, null).equals(new Franc(6, null)));
		assertFalse(new Franc(5, null).equals(Money.dollar(5)));
	}

	@Test
	public void testFrancMultiplication() throws Exception {
		Franc five = new Franc(5, null);
		assertEquals(new Franc(10, null), five.times(2));
		assertEquals(new Franc(15, null), five.times(3));
	}

	@Test
	public void testCurrency() throws Exception {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void testDifferrentClassEquality() throws Exception {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}

}
