import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class GrepTest {
	private Grep grep1;
	@Before
	public void setUp()
	{
		grep1=new Grep();
	}
	@Test
	public void test() throws IOException {
		File file=new File("C:\\test\\file.txt");
		String string="hii";
		String output=grep1.findNumberOfLines(file,string);
		String expectedoutput="{1=hey hii hello hii hey hahaha hey hii, 2=hii hello hii hey hii, 3=hii hii abcdevghh, 4=Element not found, 5=hghed hegbfhwge hii hjefvhw hii hii}";
		assertEquals(expectedoutput,output);
		System.out.println(output);
	}

}
