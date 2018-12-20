package com.moneymoneybank;

public abstract class BankAccount {
	private static int accountIdentificationNumber;
	protected int  accountNumber;
	protected String name;
	protected int currentBalance;
	
	static{
		accountIdentificationNumber = 101;
	}
	
	BankAccount(String name, int initialBalance){
		this.accountNumber=accountIdentificationNumber++;
		this.name=name;
		this.currentBalance=initialBalance;		
	}
	BankAccount(String name)
	{
		this.accountNumber=accountIdentificationNumber++;
		this.name=name;
	}
	
	public static int getNextAccountNumber()
	{
		return accountIdentificationNumber;	
	}
	
	public int getAccountBalance()
	{
		return this.currentBalance;
	}
	
	public void deposit(int amount)
	{
		this.currentBalance=amount>0?this.currentBalance+=amount:this.currentBalance;
	}
	
	public abstract void withDraw(int amount);
	
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
}
	
	
	
