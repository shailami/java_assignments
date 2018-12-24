import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyClass implements Serializable {
	private String name;
	private int age;

	protected MyClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyClass [name=" + name + ", age=" + age + "]";
	}

	public void deserialize(File file, List<MyClass> arraylist)
			throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(arraylist);
		oos.close();
		fos.close();
	}

	public ArrayList serialization(File file) throws IOException,
			ClassNotFoundException {
		//ArrayList result = null;
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList <MyClass>result = (ArrayList<MyClass>) (ois.readObject());
		fis.close();
		ois.close();
		return result;
	}

}
