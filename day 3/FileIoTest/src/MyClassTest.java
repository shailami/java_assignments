import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
	private MyClass myClass1;
	private MyClass myClass2;
	private MyClass myClass3;
	private MyClass myClass4;
	private MyClass myClass5;
	List<MyClass> arraylist;

	@Before
	public void setUp() {
		arraylist = new ArrayList<MyClass>();
		myClass1 = new MyClass("SHELL", 10);
		myClass2 = new MyClass("SHAIL", 11);
		myClass3 = new MyClass("SHAILU", 12);
		myClass4 = new MyClass("SHELLU", 13);
		myClass5 = new MyClass("SHAILAJA", 14);
		arraylist.add(myClass1);
		arraylist.add(myClass2);
		arraylist.add(myClass3);
		arraylist.add(myClass4);
		arraylist.add(myClass5);
	}

	@Test
	public void test() throws IOException {
		File file = new File("C:\\test\\ArrayList.txt");
		myClass1.deserialize(file, arraylist);
		assertEquals(true, file.exists());
	}

	@Test
	public void SerializeTest() throws ClassNotFoundException, IOException {
		File file = new File("C:\\test\\ArrayList.txt");
		myClass1 = new MyClass("SHELL", 10);
		ArrayList<MyClass> result = myClass1.serialization(file);
		System.out.println(result.toString());
		assertEquals(arraylist.toString(), result.toString());
	}

}
