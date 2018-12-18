import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class MissingElementTest {

	
	@Test
	public void Firsttest() {
		//fail("Not yet implemented");
		MissingElement miss=new MissingElement();
		int [] input={5,4,6,7,3,1,0};
		assertEquals(2,miss.elementMissing(input));
	}

	@Test
	public void Secondtest() {
		//fail("Not yet implemented");
		MissingElement miss=new MissingElement();
		int [] input={3,5,8,1,4,6,0,2};
		assertEquals(7,miss.elementMissing(input));
	}
}
