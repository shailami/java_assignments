import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ComplexTest {
	private Complex complex1;
	private Complex complex2;
	private Complex complex3;
	@Before
	public void SetUp(){
	complex1=new Complex();
	complex1.set(10.0, 2.34);
	complex2=new Complex();
	complex2.set(23.4,5.67);
	
	}
	@Test
	public void SetTest()
	{
		assertEquals(10,complex1.getReal(),0);
		assertEquals(2.34,complex1.getImaginary(),0);
		
	}

	@Test
	public void SumTest() {
		complex3 = complex1.sum(complex1,complex2);
	    assertEquals(33.4, complex3.getReal(),0);
	    assertEquals(8.01, complex3.getImaginary(),0);
	    }
	@Test
	public void DisplayTest()
	{
		complex1.display();
		complex2.display();
		complex3 = complex1.sum(complex1,complex2);
		complex3.display();
		
	}
	}

