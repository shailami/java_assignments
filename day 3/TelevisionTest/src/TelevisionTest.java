import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {
	private Television television1;
	
	@Before
	public void SetUp()
	{
		television1=new Television();
		television1.setState("ONN");
		television1.setCurrentChannel(101);
		television1.setCurrentVolume(3);
	}

	@Test
	public void GetStateTest() {
		assertEquals("ONN",television1.getState());
	}
	@Test
	public void GetCurrentChannelTest() {
		assertEquals(101,television1.getCurrentChannel());
	}
	@Test
	public void GetCurrentVolumeTest() {
		assertEquals(3,television1.getCurrentVolume());
	}
	@Test
	public void AddVolumeTest() {
		assertEquals(8,television1.AddVolume(5));	
	}
	@Test
	public void DecreaseVolumeTest() {
		assertEquals(1,television1.decreaseVolume(2));
	}
	@Test
	public void ChangeChannelTest() {
		assertEquals(100,television1.changeChannel(100));
	}
	@Test
	public void ChangeStateTest() {
		assertEquals("OFF",television1.changeState("OFF"));
	}	
}







