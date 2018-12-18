import static org.junit.Assert.*;

import org.junit.Test;


public class OccuranceTest {

	private String [] input={"abba","dabba","chabba","shell","abba","shell"};

	@Test
	public void Positivetest() {
		//fail("Not yet implemented");
		Occurance occurance=new Occurance();
		assertEquals(2,occurance.noOfOccurance("shell",input));
	}
	
	@Test
	public void Negativetest() {
		//fail("Not yet implemented");
		Occurance occurance=new Occurance();
		assertEquals(0,occurance.noOfOccurance("shail",input));
	}

}
