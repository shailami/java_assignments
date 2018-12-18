
public class Distance {
	private int feet;
	private double inches;
	private int addFeet;
	private double addInches;
	
	public Distance(int feet, double Inches) {
		this.feet=feet;
		this.inches=Inches;
	}
	public Distance()
	{
		
	}

	public void set(int feet, double inches) {
		this.feet=feet;
		this.inches=inches;
	}

	public void display() {
		System.out.println("Feet: "+this.feet+" Inches: "+this.inches);
	}

	public Distance add(Distance distance) {
	 addFeet=this.feet+distance.feet;
	 addInches=this.inches+distance.inches;
	 return new Distance(addFeet,addInches);	
	}
	public int getfeet() {
		return feet;
	}
	public double getInches() {
		return inches;
	}
	

}
