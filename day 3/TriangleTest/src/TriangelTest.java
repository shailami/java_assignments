import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangelTest {
	private Triangle triangle1;
	private Triangle triangle2;
	private Triangle triangle3;
	@Before
	public void SetUp()
	{
		triangle1=new Triangle(3,4,5);
		triangle2=new Triangle(20,20,20);
		triangle3=new Triangle(10,10,30);
		
	}
	
	@Test
	public void IsocelesTest() {
		assertEquals(true,triangle3.isIsosceles(triangle3));
	}
	@Test
	public void RightTest() {
		assertEquals(true,triangle1.isRight(triangle1));
	}
	@Test
	public void ScaleneTest() {
		assertEquals(true,triangle2.isScalene(triangle1));
	}
	@Test
	public void EquilateralTest() {
		assertEquals(true,triangle1.isEquilateral(triangle2));
	}

}


