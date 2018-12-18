import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TimeTest {
	private Time time1;
	private Time time2;
	private Time time3;
	
	@Before
	public void SetUp(){
	time1=new Time();
	time1.setTime(2,60);
	time2=new Time();
	time2.setTime(3,60);
	time3=new Time();
	}

	@Test
	public void SumTest() {
	time3=time1.sumTime(time1,time2);
	assertEquals(7,time3.getHour());
	assertEquals(0,time3.getMinutes());
	System.out.println(time3.getHour());
	}
	
	@Test
	public void ShowTimeTest(){
		time1.showTime();
		time2.showTime();
		time3=time1.sumTime(time1,time2);
		time3.showTime();
	}
}
