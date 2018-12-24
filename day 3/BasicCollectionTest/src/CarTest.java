import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;


public class CarTest {
	private Car car1;
	private Car car2;
	private Car car3;
	private Car car4;
	Set<Car>set=new HashSet<Car>();

	@Test
	public void test() {
		car1=new Car("AUDI", "J5", 2000, 89076);
		car2=new Car("MERCEDES", "J4", 2000, 9999996);
		car3=new Car("BMW", "J3", 2000, 999999996);
		car4=new Car("AUDI", "J5", 2000, 89076);
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);
		Iterator <Car>iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().toString());
		}
	}

}
