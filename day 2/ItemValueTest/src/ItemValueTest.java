import static org.junit.Assert.*;

import org.junit.Test;


public class ItemValueTest {

	@Test
	public void FirstTest() {
		ItemValue ivalue=new ItemValue();
		assertEquals(374,ivalue.getNewValue(576),0.4);
	}
	
	@Test
	public void SecondTest() {
		ItemValue ivalue=new ItemValue();
		assertEquals(26,ivalue.getNewValue(40),0);
	}

}
