import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayIndexDistanceTest {

	@Test
	public void PositiveResultArrayTest() {
		//fail("Not yet implemented");
		ArrayIndexDistance arrayindex=new ArrayIndexDistance();
		assertEquals(true,arrayindex.isPresentAtDistance(3));
		
	}
	
	
	@Test
	public void NegativeResultArrayTest() {
		//fail("Not yet implemented");
		ArrayIndexDistance arrayindex=new ArrayIndexDistance();
		assertEquals(false,arrayindex.isPresentAtDistance(1));	
	}

}
