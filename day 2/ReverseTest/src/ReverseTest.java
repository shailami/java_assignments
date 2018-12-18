import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class ReverseTest {

	@Test
	
	public void test() 
	{
		Reverse reverse=new Reverse();
		assertEquals("s'teL ekat edoCteeL tsetnoc",reverse.getReverse("Let's take LeetCode contest"));
	}

}
