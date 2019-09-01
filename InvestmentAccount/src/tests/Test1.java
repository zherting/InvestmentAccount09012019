package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.InvestmentAccount;
import model.InvestmentCalculation;

public class Test1 {
	InvestmentAccount account = new InvestmentAccount();
	InvestmentCalculation accountCal = new InvestmentCalculation();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testProfit() {
		account.setBalance(5000);
		account.setInterest(0.003);
		account.setMonth(18);
		double profit = accountCal.profit(account);
		assertEquals(270, profit, 0.0);
	}

}
