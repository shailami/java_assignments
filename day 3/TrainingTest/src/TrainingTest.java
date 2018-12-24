import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TrainingTest {
	private Training training1;
	private Training training2;
	
	@Before
	public void setUp()
	{
		training1=new PublicTraining(101,"Java",5000,50); 
		training2=new CorporateTraining(102,"BigData",35000,4);
	}

	@Test
	public void PublicTrainingTest() {
	assertEquals(5000*50,((PublicTraining) training1).getOrderValue());
	}
	
	@Test
	public void CorporateTrainingTest() {
	assertEquals(35000*4,((CorporateTraining) training2).getOrderValue());
	}


}
