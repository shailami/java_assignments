package com.advancedCollection;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class SavingAccountTest {
	private SavingAccount savingAccount1;
	private SavingAccount savingAccount2;
	private SavingAccount savingAccount3;
	private SavingAccount savingAccount4;
	private SavingAccount savingAccount5;
	private BankAccount bankAccount = new BankAccount();
	List<SavingAccount> list = new ArrayList<SavingAccount>();
	TreeSet<SavingAccount> treeSet = new TreeSet<SavingAccount>();

	@Before
	public void setUp() {
		savingAccount1 = new SavingAccount(90900, "AB101CDF", "SHAILAJA", true);
		savingAccount2 = new SavingAccount(90900, "AB101CDF", "SHAILAJA", true);
		savingAccount3 = new SavingAccount(101, "DE29847G", "priyanka", true);
		savingAccount4 = new SavingAccount(560, "CD74656H", "hemlata", true);
		savingAccount5 = new SavingAccount(2076, "BC647H5O", "tejas", true);
	}

	@Test
	public void ArrayListTest() throws IOException, ClassNotFoundException {
		list.add(savingAccount1);
		list.add(savingAccount2);
		list.add(savingAccount3);
		list.add(savingAccount4);
		list.add(savingAccount5);

		File file = new File("C:\\test\\SavingAccountArrayList.txt");
		bankAccount.serialization(file, list);
		ArrayList<SavingAccount> output = (ArrayList<SavingAccount>) bankAccount.deserialization(file);
		assertEquals(list.toString(), output.toString());
	}

	@Test
	public void TreeSetTest() throws IOException, ClassNotFoundException {
		treeSet.add(savingAccount1);
		treeSet.add(savingAccount2);
		treeSet.add(savingAccount3);
		treeSet.add(savingAccount4);
		treeSet.add(savingAccount5);
		File file = new File("C:\\test\\SavingAccountTreeSet.txt");
		bankAccount.serialization(file, treeSet);
		TreeSet<SavingAccount> output = (TreeSet<SavingAccount>) bankAccount.deserialization(file);
		assertEquals(treeSet.toString(), output.toString());
	}
}
