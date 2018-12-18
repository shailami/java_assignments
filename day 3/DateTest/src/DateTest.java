import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DateTest {
	private Date date1;
	private Date date2;
	@Before
	public void SetUp(){
		date1=new Date(12,10,1997);
		date2=new Date(11,10,1997);
	}
	@Test
	public void IsSmallerTest() {
		assertEquals(false,date1.isSmaller(date2));
	}
	@Test
	public void IsSmallerTestForSameDate() {
		assertEquals(false,date1.isSmaller(date1));
	}
	@Test
	public void DisplayTest() {
	String firstDate=date1.toString();
	String secondDate=date2.toString();
	System.out.println(firstDate);
	System.out.println(secondDate);
	}
	@Test
	public void DifferenceTest() {
		int []expectedResult={1,0,0};
		int []actualResult=date1.differenceBetween(date2);
		assertEquals(expectedResult[0],actualResult[0]);
		assertEquals(expectedResult[1],actualResult[1]);
		assertEquals(expectedResult[2],actualResult[2]);
	}
}
