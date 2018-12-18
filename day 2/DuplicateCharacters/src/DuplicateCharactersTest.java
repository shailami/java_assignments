import static org.junit.Assert.*;

import org.junit.Test;


public class DuplicateCharactersTest {

	@Test
	public void FirstTest() {
		DuplicateCharacters duplicate=new DuplicateCharacters();
		assertEquals("javforschl",duplicate.removeDuplicates("javaforschool"));
	}
	@Test
	public void SecondTest() {
		DuplicateCharacters duplicate=new DuplicateCharacters();
		assertEquals("Misp",duplicate.removeDuplicates("Mississippi"));
	}
	@Test
	public void ThirdTest() {
		DuplicateCharacters duplicate=new DuplicateCharacters();
		assertEquals("abc",duplicate.removeDuplicates("abcabcabc"));
	}
	

}
