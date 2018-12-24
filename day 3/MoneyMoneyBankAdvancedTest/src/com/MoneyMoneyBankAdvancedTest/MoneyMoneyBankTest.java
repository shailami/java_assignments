package com.MoneyMoneyBankAdvancedTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyMoneyBankTest {
	private BankFactory bankFactory1;
	private SavingAccount savingAccount;
	private CurrentAccount currentAccount;
	@Before
	public void setUp(){
		bankFactory1=new MMBankFactory();
		savingAccount=bankFactory1.getNewSavingAccount(101,"shell",10000,true);
		currentAccount=bankFactory1.getNewCurrentAccount(102, "shailaja", 20000,1000);	
	}

	@Test
	public void SavingDepositTest() {
		savingAccount.deposit(500);
		assertEquals(10500,savingAccount.getAccountBalance(),0.0);		
	}
	
	@Test
	public void SavingWithDrawTest() {
		savingAccount.deposit(500);
		assertEquals(10500,savingAccount.getAccountBalance(),0.0);
	}
	@Test
	public void SavingToStringTest() {
		savingAccount.toString();
	}
	
	@Test
	public void CurrentDepositTest() {
		currentAccount.deposit(500);
		assertEquals(20500,currentAccount.getAccountBalance(),0.0);
	}
	
	@Test
	public void CurrrentWithdrawTest() {
		currentAccount.withDraw(500);
		assertEquals(19500,currentAccount.getAccountBalance(),0.0);
	}
	@Test
	public void CurrrentToStringTest() {
		currentAccount.toString();
	}
	
}
