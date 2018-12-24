import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;


public class EmployeePersistantTest {
	private Employee employee;
	@Before
	public void setUp(){
		employee=new Employee(101,"Shailaja",90);
	}
	

	@Test
	public void DeserializeTest() throws IOException {
		File file =new File("C:\\test\\Employee.txt");
		employee.deserialize(file,employee);
		assertEquals(true,file.exists());	
	}
	
	

}
