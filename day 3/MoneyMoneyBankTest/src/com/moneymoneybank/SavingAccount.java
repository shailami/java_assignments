package com.moneymoneybank;

public class SavingAccount extends BankAccount{
	
	
	SavingAccount(String name, int initialBalance) {
		super(name, initialBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(int amount) {
		if(this.currentBalance>=amount&&amount>0)
		this.currentBalance-=amount;
	}

	public void fundTransfer( SavingAccount sender ,SavingAccount reciever , double amount) 
	{
		PaymentGateway.transfer(sender, reciever, amount);

	}

	
}
