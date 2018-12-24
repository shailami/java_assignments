import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class EmployeePersistantTestReadTest {
	private Employee employee;
	@Before
	public void setUp(){
		employee=new Employee(101,"Shailaja",90);
	}
	
	@Test
	public void SerializeTest() throws ClassNotFoundException, IOException{
		File file =new File("C:\\test\\Employee.txt");
		Object result = employee.serialization(file);
		System.out.println(result.toString());
		assertEquals(employee.toString(),result.toString());
	}

}
