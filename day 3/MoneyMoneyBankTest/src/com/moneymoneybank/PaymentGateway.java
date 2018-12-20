package com.moneymoneybank;

 class PaymentGateway {
	//method to transfer the given amount from the src to target account.
	public static boolean transfer(SavingAccount sender, SavingAccount reciever, double amount) 
	{
		boolean flag;
		if(sender.currentBalance>=amount && amount>0)
		{
		sender.currentBalance-=amount;
		reciever.currentBalance+=amount;
		flag=true;
		}
		else flag=false;
		return flag;
	}
}

