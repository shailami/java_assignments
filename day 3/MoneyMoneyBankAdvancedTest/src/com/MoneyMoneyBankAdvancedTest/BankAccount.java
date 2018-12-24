package com.MoneyMoneyBankAdvancedTest;

public abstract class BankAccount {
	private static int accountIdentificationNumber;
	private String accountHolderName;
	private double accountBalance;
	private int accountNumber;
	
	static{
		accountIdentificationNumber=101;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public BankAccount(int accountNumber,String accountHolderName,double accountBalance) {
		this.accountNumber=accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public abstract void withDraw(double amunt);
	
	public void deposit(double amount){
	this.accountBalance+=amount;
	}
	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountNumber="
				+ accountNumber + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountBalance()="
				+ getAccountBalance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
