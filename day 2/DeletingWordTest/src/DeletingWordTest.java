import static org.junit.Assert.*;

import org.junit.Test;


public class DeletingWordTest {

	private String input="A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";

	@Test
	public void test() {
		DeletingWord dword=new DeletingWord();
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.",dword.getResult(input,"IS",6));
	}

}
