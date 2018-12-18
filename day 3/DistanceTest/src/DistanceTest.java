import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistanceTest {
	private Distance distance1;
	private Distance distance2;
	private Distance distance3;
	
	@Before
	public void SetUp()
	{
		distance1=new Distance();
		distance1.set(10, 50);
		distance2=new Distance();
		distance2.set(30,60);
		distance3=new Distance();
	}
	@Test
	public void AddTest() {
		distance3=distance1.add(distance2);
		assertEquals(40,distance3.getfeet());
		assertEquals(110,distance3.getInches(),0);
	}
	@Test
	public void DisplayTest()
	{
		distance1.display();
		distance2.display();
		distance3=distance1.add(distance2);
		distance3.display();
	}

}
