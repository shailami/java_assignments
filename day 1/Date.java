import java.util.*;
class Date
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the date in format 'DD-MM-YYYY':");
			String date=sc.nextLine();
			String day=date.substring(0,2);
			String month=date.substring(3,5);
			String year=date.substring(6,10);
			//System.out.println(day);
			//System.out.println(month);
			//System.out.println(year);
			String montH=select(month);
			System.out.println(day+"/"+montH+"/"+year);
		}
	static String select(String m)
		{
			String mon="null";
			switch(m)
			{
				case "01":mon="Januaury";
				break;
				case "02":mon="Februarury";
				break;
				case "03":mon="March";
				break;
				case "04":mon="April";
				break;
				case "05":mon="May";
				break;
				case "06":mon="June";
				break;
				case "07":mon="July";
				break;
				case "08":mon="August";
				break;
				case "09":mon="September";
				break;
				case "10":mon="October";
				break;
				case "11":mon="November";
				break;
				case "12":mon="December";
				break;
				default:System.out.println("Invalid MONTH ");
			}
			return (mon);

		}
}
			
			