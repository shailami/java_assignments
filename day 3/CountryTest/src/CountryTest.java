import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountryTest {
	private Country country1;
	private Country country2;
	private Country country3;

	
	@Before
	public void SetUp()
	{
		country1=new Country();
		country1.setCountryName("India");
		country1.setCountryArea(1000);
		country1.setCountryPopulation(100000000);
		country2=new Country();
		country2.setCountryName("China");
		country2.setCountryArea(800);
		country2.setCountryPopulation(900000000);
		country3=new Country();
		country3.setCountryName("America");
		country3.setCountryArea(1700);
		country3.setCountryPopulation(300000);
	}
	@Test 
	public void LargestAreaTest() {
		Country input[]={country1,country2,country3};
		assertEquals("America",country1.largestArea(input));
	}
	@Test
	public void LargestPopulation(){
		Country input[]={country1,country2,country3};
		assertEquals("China",country1.largestPopulation(input));
	}
	@Test
	public void LargestPopulationDensity(){
		Country input[]={country1,country2,country3};
		assertEquals("China",country1.largestPopulationDensity(input));
	}
}
