package com.advancedCollection;

import java.io.Serializable;

public class SavingAccount implements Serializable,Comparable<SavingAccount> {
	private double acc_balance;
	private String acc_ID;
	private String accountHoldername;
	private boolean isSalaryAccount;

	protected SavingAccount(double acc_balance, String acc_ID,
			String accountHoldername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public String getAcc_ID() {
		return acc_ID;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID="
				+ acc_ID + ", accountHoldername=" + accountHoldername
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	public void withdraw(double amount) {
		if (amount > 0 && this.acc_balance >= amount)
			this.acc_balance -= amount;
	}

	public void deposit(double amount) {
		if(amount>0)
		this.acc_balance += amount;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acc_ID == null) ? 0 : acc_ID.hashCode());
		long temp;
		temp = Double.doubleToLongBits(acc_balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountHoldername == null) ? 0 : accountHoldername
						.hashCode());
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (acc_ID == null) {
			if (other.acc_ID != null)
				return false;
		} else if (!acc_ID.equals(other.acc_ID))
			return false;
		if (Double.doubleToLongBits(acc_balance) != Double
				.doubleToLongBits(other.acc_balance))
			return false;
		if (accountHoldername == null) {
			if (other.accountHoldername != null)
				return false;
		} else if (!accountHoldername.equals(other.accountHoldername))
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	@Override
	public int compareTo(SavingAccount savingAccount) {
		return (acc_ID.compareTo(savingAccount.acc_ID));
	}

}
