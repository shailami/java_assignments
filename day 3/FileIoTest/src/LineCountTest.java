import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class LineCountTest {
	private LineCount lineCount1;
	private LineCount lineCount2;
	@Before
	public void setUp(){
		lineCount1=new LineCount();
		lineCount2=new LineCount();
	}

	@Test
		public void test() throws IOException {
			File file=new File("C:\\MyProject\\Thirdfile.txt");
			assertEquals(1,lineCount1.countLine(file));
		}
	}


