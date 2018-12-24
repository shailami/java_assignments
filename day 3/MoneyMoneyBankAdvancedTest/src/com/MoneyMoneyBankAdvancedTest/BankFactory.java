package com.MoneyMoneyBankAdvancedTest;

public abstract class BankFactory {

	public abstract SavingAccount getNewSavingAccount(int accountNumber,String name,double accBalance,boolean isSalaried);
	public abstract CurrentAccount getNewCurrentAccount(int accountNumber,String name,double accBalance,double creditLimit);

}
