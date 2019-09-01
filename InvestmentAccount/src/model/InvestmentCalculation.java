package model;

public class InvestmentCalculation {
	double interestLine = 2500;

	public double profit(InvestmentAccount account) {
		double profit = 0;
		profit = account.getBalance() * account.getInterest() * account.getMonth();
		return profit;
	}

	public boolean getprofit(InvestmentAccount account) {
		if (account.getBalance() >= interestLine) {
			return true;
		} else {
			return false;
		}
	}
}
