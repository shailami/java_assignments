import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeSortTest {

	private String [] input={"eye","mom","abba","aaabaaa"};

	@Test
	public void test() {
		PalindromeSort psort=new PalindromeSort();
		assertEquals(true,psort.isPalindrome(input));
	}

}
