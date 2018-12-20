import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {
	private Person person1;
	private Person person2;
	@Before
	public void setUp(){
		person1=new Person("shell",11,03,1997);
		person2=new Person("shailaja",11,12,1817);
	}

	@Test
	public void test() {
		String str=person1.toString();
		System.out.println(str);
		String expectedOutput="shailaja is 179 years 3 months 0 days older than shell";
		assertEquals(expectedOutput,person1.olderOne(person2));
	}

}
