import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String name;
	private int year,years;
	private int month,months;
	private int day,days;
	private String result;
	private boolean flag=false;
		
	public Person(String name, int day, int month, int year) 
	{
		this.name=name;
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{ 
		  return "Name: "+name+"\nDOB: "+this.day+"/"+this.month+"/"+this.year+"\nAge: "+age();  
	}  
	public String age()
	{
		LocalDate dob= LocalDate.of(this.year,this.month,this.day); 
		LocalDate today=LocalDate.now();
		Period p=Period.between( dob,today);
		days=p.getDays();
		months=p.getMonths();
		years=p.getYears();
		return +years+" years "+months+" months "+days+" days";
	}
	public String olderOne(Person person)
	{
		if(this.year > person.year)
		{
			flag=false;
		}
		else if(this.year==person.year)
		{
			if(this.month > person.month)
			{
				flag=false;
			}
			else if(this.month==person.month)
			{
				if(this.day > person.day)
				{
					flag=false;
				}
				else if(this.day==person.day)
				{
					System.out.println("both are same age");
				}
				else
					flag=true;
			}
			else
				flag=true;
		}
		else
		{
			flag=true;
		}
		
		LocalDate dob1= LocalDate.of(this.year,this.month,this.day);
		LocalDate dob2= LocalDate.of(person.year,person.month,person.day);
		
		if(flag==true)
		{
			Period p1=Period.between(dob1,dob2 );
			result= ""+this.name+" is "+p1.getYears()+" years "+p1.getMonths()+" months "+p1.getDays()+" days older than "+person.name;;
		}
		else
		{
			Period p2=Period.between(dob2,dob1 );
			result= ""+person.name+" is "+p2.getYears()+" years "+p2.getMonths()+" months "+p2.getDays()+" days older than "+this.name;
		}
		return result;
	}
	
}
