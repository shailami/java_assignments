
public class Time {
	private int hour;
	private int minutes;
	private int newMinutes;
	private int newHour;
	
	public Time(){}
	
	public Time(int hour, int minutes) {
		this.hour=hour;
		this.minutes=minutes;
	}
	

	public void setTime(int hour, int minute) {
		this.hour=hour;
		this.minutes=minute;
	}

	public void showTime() {
		System.out.println(+this.hour+" Hours "+this.minutes+" minutes");
	}

	public Time sumTime(Time time1, Time time2) {
		
		newHour=(time1.hour+time2.hour);
		newMinutes=time1.minutes+time2.minutes;
		while(newMinutes>=60)
		{
			newMinutes-=60;
			newHour++;
		}
		System.out.println(newHour);
		return new Time( newHour,newMinutes);	
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinutes() {
		return this.minutes;
	}

}
