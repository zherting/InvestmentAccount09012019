package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.InvestmentAccount;
import model.InvestmentCalculation;

public class Test2 {
	InvestmentAccount account = new InvestmentAccount();
	InvestmentCalculation accountCal = new InvestmentCalculation();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetProfit() {
		account.setBalance(5000);
		assertTrue(accountCal.getprofit(account));
	}

	public void testGetProfit2() {
		account.setBalance(1000);
		assertFalse(accountCal.getprofit(account));
	}
}
