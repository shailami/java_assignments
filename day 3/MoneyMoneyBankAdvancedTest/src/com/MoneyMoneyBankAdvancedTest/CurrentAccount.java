package com.MoneyMoneyBankAdvancedTest;

public abstract class CurrentAccount extends BankAccount {
	private double creditLimit;

	public CurrentAccount( int accountNumber,String accountHolderName,double accountBalance,double creditLimit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.creditLimit=creditLimit;
	}

	@Override
	public abstract void withDraw(double amount);

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double getCreditLimit() {
		return creditLimit;
	}
}
