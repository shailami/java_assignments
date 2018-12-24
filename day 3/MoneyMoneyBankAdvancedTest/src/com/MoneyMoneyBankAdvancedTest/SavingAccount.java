package com.MoneyMoneyBankAdvancedTest;

public abstract class SavingAccount extends BankAccount {
	private boolean isSalaried=true;
	private static final double  MINBALANCE=100;

	public SavingAccount(int accountNumber, String accountHolderName,double accountBalance,boolean isSalaried) {
		super(accountNumber,accountHolderName, accountBalance);
		this.isSalaried=isSalaried;
	}

	@Override
	public abstract void withDraw(double amount);

	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public static double getMinbalance() {
		return MINBALANCE;
	}
}
