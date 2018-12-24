import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


public class WordCountTest {
	private WordCount wordCount;
	@Before
	public void setUp()
	{
		wordCount=new WordCount();
	}

	@Test
	public void test() throws IOException {
		File file=new File("C:\\MyProject\\Thirdfile.txt");
		assertEquals(10,wordCount.countWords(file));
	}

}
