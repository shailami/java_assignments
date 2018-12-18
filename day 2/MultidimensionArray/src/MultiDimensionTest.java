import static org.junit.Assert.*;

import org.junit.Test;


public class MultiDimensionTest {

	private int[][] input={{1,2,3},{4,5,6},{7,8,9}};

	@Test
	public void PositiveTest() {
		MultiDimensionArray mArray=new MultiDimensionArray();
		assertEquals(true,mArray.isPresent(input,5));
	}
	@Test
	public void NegativeTest() {
		MultiDimensionArray mArray=new MultiDimensionArray();
		assertEquals(false,mArray.isPresent(input,15));
	}

}
