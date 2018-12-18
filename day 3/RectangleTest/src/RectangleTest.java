import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleTest {
	private Rectangle rec1;
	private Rectangle rec2;

	@Before
	public void SetUp(){
	 rec1=new Rectangle();
	 //rec1.setLength(10);   //we can send arguments from here as well.
	 //rec1.setBreadth(10);
	 rec2=new Rectangle();
	}
	
	@Test
	public void AreaRectangle1Test() {
		assertEquals(100,rec1.getArea(10,10),0);
	}
	@Test
	public void AreaRectangle2Test() {
		assertEquals(100,rec2.getArea(20,5),0);
	}
	@Test
	public void CompareAreaTest() {
		assertEquals(true,rec1.compareAreaIsSAme(rec1,rec2));
	}

}
