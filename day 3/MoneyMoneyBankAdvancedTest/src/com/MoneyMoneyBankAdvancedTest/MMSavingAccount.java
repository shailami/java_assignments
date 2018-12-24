package com.MoneyMoneyBankAdvancedTest;

public class MMSavingAccount extends SavingAccount{
	//private static final double MINBALANCE=100;

public MMSavingAccount(int accountNumber,String accountHolderName, double accountBalance,boolean isSalaried) {
		super(accountNumber,accountHolderName, accountBalance,isSalaried);
		
	}

	@Override
	public void withDraw(double amount) {
		if((this.getAccountBalance()>=(amount+this.getMinbalance()))&&amount>0)
		{
			this.deposit(-amount);
		}
	}

	@Override
	public String toString() {
		return "MMSavingAccount [toString()=" + super.toString()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
