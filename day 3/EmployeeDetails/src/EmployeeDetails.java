
public class EmployeeDetails
{
	private int id;
	private String name;
	private double monthlyBasic;
	private static float pfrate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	 public static void setPFRate(float pfrate) {
		EmployeeDetails.pfrate=pfrate;
	}
	 public static float getPFRate() {
		return pfrate; 
	}
	public double getAnnualBasic() {
		return  (12 * monthlyBasic);
	}	
	public double getMonthlyGrossSalary() {
		 double hra=(0.5*getMonthlyBasic());
		 int medical=1250;
		 int conveyance=800;
		return(monthlyBasic+hra+medical+conveyance);
	}
	public double getAnnualGrossSalary() {
		return (12 * getMonthlyGrossSalary());
	}
	public double getMonthlyDeductions() {
	double pf=((EmployeeDetails.getPFRate()*monthlyBasic/100)<6500?(EmployeeDetails.getPFRate()*monthlyBasic/100):6500);
	double esic=monthlyBasic<=5000?(0.0475*monthlyBasic):0;
	int profTax=getMonthlyGrossSalary()<=10000?50:100;
		 return (pf + esic + profTax);
	}
	 public double getMonthlyTakeHome() {
		 return (getMonthlyGrossSalary()- getMonthlyDeductions());
	}
	 public double getAnnualTakeHome() {
		 return (12 * getMonthlyTakeHome());
	}

}

