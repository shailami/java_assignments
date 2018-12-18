
public class Date {
	private int day;
	private int month;
	private int year;
	private boolean flag;
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		String string=String.valueOf(this.day)+String.valueOf(this.month)+String.valueOf(this.year);
		return string;	
	}
	public boolean isSmaller(Date d) 
	{
		if(this.year>d.year)
		{
			flag=false;
		}
		else if(this.year==d.year)
		{
			if(this.month>d.month)
			{
				flag=false;
			}
			else if(this.month==d.month)
			{
				if(this.day>d.day)
				{
					flag=false;
				}
				else if(this.day==d.day)
				{
					flag=false;
				}
				else flag=true;
			}
			else flag=true;
		}
		else
			flag=true;
		return flag;
	}
	public int[] differenceBetween(Date d) {
		
		int []difference =new int[3];
		difference[0]=(this.day-d.day);
		difference[1]=(this.month-d.month);
		difference[2]=(this.year-d.year);
		return difference;
	}

}
