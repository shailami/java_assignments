import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VehicleTest {
	private Vehicle vehicle1;
	@Before
	public void setUp()
	{
		vehicle1=new Vehicle("SHELL");	
	}
	@Test
	public void test() {
		assertEquals(102,vehicle1.getVehicleIdNumber());
		assertEquals(100,vehicle1.changeCurrentSpeed(100));
		assertEquals(0,vehicle1.stop());
		assertEquals("SHELL",vehicle1.getOwnerName());
		assertEquals(0,vehicle1.getCurrentDirection());
		assertEquals("NorthWest",vehicle1.twoTurn("left", 110));
		assertEquals("SouthEast",vehicle1.twoTurn("right", 130));
		//both the assert conditions (right and left) are checked simultaneously
	}

}
