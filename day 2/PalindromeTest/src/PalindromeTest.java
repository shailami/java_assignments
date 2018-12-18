import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class PalindromeTest {
	private Palindrome palindrome;

	@BeforeClass
	public static void before()
	{
		 System.out.println("before class");
	}
	@AfterClass
	public static void after()
	{
		 System.out.println("after class");
	}
	
	@Before
	public void setUp(){
		 palindrome = new Palindrome();
		 System.out.println("before");
	}
	@After
	public void tearDown()
	{
		 System.out.println("After");
	}
   
	@Test
	@Category(goodCategory.class)
	public void TestforPositivePalindromeNumber() throws InvalidNumberException {
		assertEquals(true,palindrome.isPalindrome(121));
	}
		
	@Test (expected=InvalidNumberException.class)
	public void TestforNegativePalindromeNumber() throws InvalidNumberException  {
		assertEquals(false,palindrome.isPalindrome(-121));
	}
	
	@Test
	@Category(goodCategory.class)
	public void TestforNonPalindromeNumber() throws InvalidNumberException {
		assertEquals(false,palindrome.isPalindrome(10));
	}
	@Test (expected=InvalidNumberException.class)
	public void WhenNumberPassedIsLessThan10ExceptionIsThrown() throws InvalidNumberException
	{
		palindrome.isPalindrome(9);
	}
	
	@Ignore
	@Test (timeout=1)
	public void TimeOutTest() throws InvalidNumberException
	{
		for(long i=1;i<100000000;i++)
		{
			palindrome.isPalindrome(121);
		}
	}
	

}
