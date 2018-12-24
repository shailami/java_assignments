import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Employee implements Serializable{
	private int employeeId;
	private String employeeName;
	private long salary;
	
	protected Employee(int employeeId, String employeeName, long salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;	
	}
	
	public void deserialize(File file, Employee employee) throws IOException{
	FileOutputStream fos = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(employee);
    oos.close();
    fos.close();
	}
	
	public Employee serialization(File file) throws IOException, ClassNotFoundException{
		Employee result =null;
	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	 result = (Employee) (ois.readObject());
	fis.close();
	ois.close();
	return result;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "]";
	}
}
