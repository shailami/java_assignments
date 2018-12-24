import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;


public class FileIoTest {
	private FileIo fileIo1;
	private FileIo fileIo2;
	@Before
	public void setUp(){
		fileIo1=new FileIo();
		fileIo2=new FileIo();
	}

	@Test
	public void test() {
		File file=new File("C:\\Users\\shailami\\Personal Details\\DegreeCertificate.pdf");
		assertEquals(true,fileIo1.exists(file));
	}

}
