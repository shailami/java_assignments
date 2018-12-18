
public class Country {
	private String countryName;
	private long countryPopulation;
	private long countryArea;
	private String largestArea;
	private String largestPopulationCountry;
	private String largestDensityPopulation;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getCountryPopulation() {
		return countryPopulation;
	}
	public void setCountryPopulation(long countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
	public long getCountryArea() {
		return countryArea;
	}
	public void setCountryArea(long countryArea) {
		this.countryArea = countryArea;
	}
	
	public String largestArea(Country[] input)
	{
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i].countryArea > input[j].countryArea)
				{
					largestArea=input[i].countryName;
				}
				else
				{
					largestArea=input[j].countryName;
				}
			}
		}
		return largestArea;
	}
	
	
	public String largestPopulation(Country[] input) {
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i].countryPopulation > input[j].countryPopulation)
				{
					largestPopulationCountry=input[i].countryName;
				}
				else
				{
					largestPopulationCountry=input[j].countryName;
				}
			}
		}
		return largestPopulationCountry;
	}
	public String largestPopulationDensity(Country[] input) {
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if((input[i].countryPopulation/input[i].countryArea) > (input[j].countryPopulation/input[j].countryArea))
				{
					largestDensityPopulation=input[i].countryName;
				}
				else
				{
					largestDensityPopulation=input[j].countryName;
				}
			}
		}
		
		return largestDensityPopulation;
	}
}
	
