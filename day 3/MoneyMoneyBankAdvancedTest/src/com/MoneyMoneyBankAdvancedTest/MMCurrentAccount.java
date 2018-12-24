package com.MoneyMoneyBankAdvancedTest;

public class MMCurrentAccount extends CurrentAccount{

	public MMCurrentAccount(int accountNumber,String accountHolderName, double accountBalance,double creditLimit) {
		super(accountNumber,accountHolderName, accountBalance,creditLimit);
	}

	@Override
	public void withDraw(double amount) {
		if((this.getAccountBalance()+this.getCreditLimit())>=amount&&amount>0)
		{
			this.deposit(-amount);
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}

