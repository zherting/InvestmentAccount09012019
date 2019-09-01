package model;

public class InvestmentAccount {
	private double balance;
	private double interest;
	private int month;

	public InvestmentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvestmentAccount(double balance, double interest, int month) {
		super();
		this.balance = balance;
		this.interest = interest;
		this.month = month;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
