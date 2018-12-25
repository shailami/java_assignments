package com.advancedCollection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BankAccount implements Serializable {

	private Object result;

	public void serialization(File file, Object obj) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
	}

	public Object deserialization(File file) throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		result = ois.readObject();
		ois.close();
		fis.close();
		return result;
	}
}
