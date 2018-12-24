package com.MoneyMoneyBankAdvancedTest;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAccount getNewSavingAccount(int accountNumber, String name,
			double accBalance, boolean isSalaried) {
		return new MMSavingAccount(accountNumber, name, accBalance, isSalaried);
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int accountNumber, String name,
			double accBalance, double creditLimit) {
		return new MMCurrentAccount(accountNumber, name,accBalance, creditLimit);
	}

}