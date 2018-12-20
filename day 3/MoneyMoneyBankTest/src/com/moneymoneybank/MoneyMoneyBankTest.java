package com.moneymoneybank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyMoneyBankTest {
	private SavingAccount savingAccount1;
	private SavingAccount savingAccount2;
	@Before
	public void setUp(){
		savingAccount1=new SavingAccount("SHELL",0);
		savingAccount2=new SavingAccount("SHAIL",150);
	}
	@Test
	public void test() {
		assertEquals(101,savingAccount1.getAccountNumber());
		assertEquals(102,savingAccount2.getAccountNumber());
		assertEquals(103,BankAccount.getNextAccountNumber());
		savingAccount1.deposit(100);
		assertEquals(100,savingAccount1.getAccountBalance());
		savingAccount1.withDraw(50);
		assertEquals(50,savingAccount1.getAccountBalance());
		savingAccount2.withDraw(50);
		assertEquals(100,savingAccount2.getAccountBalance());
		//now saving account 1 has balance 50 and saving account 2 has balance100.
		savingAccount1.fundTransfer(savingAccount1, savingAccount2, 5);
		assertEquals(45,savingAccount1.getAccountBalance());
		assertEquals(105,savingAccount2.getAccountBalance());
	}
	

}
