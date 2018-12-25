import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private Car car1;
	private Car car2;
	private Car car3;
	private Car car4;
	Set<Car> set = new HashSet<Car>();
	TreeSet<Car> treeSet = new TreeSet<Car>();
	private String result = "";

	@Before
	public void setUp() {
		car1 = new Car("AUDI", "J5", 200, 8076);
		car2 = new Car("MERCEDES", "J4", 2000, 9999996);
		car3 = new Car("BMW", "J3", 2000, 999999996);
		car4 = new Car("AUDI", "J5", 2000, 89076);
	}

	@Test
	public void DuplicateTest() {
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);
		Iterator<Car> iterator = set.iterator();
		while (iterator.hasNext()) {
			result += iterator.next().toString();
			// System.out.println(iterator.next().toString());
		}
		String expected = "Car [make=BMW, model=J3, year=2000, price=9.99999996E8]"
				+ "Car [make=MERCEDES, model=J4, year=2000, price=9999996.0]"
				+ "Car [make=AUDI, model=J5, year=200, price=8076.0]";
		assertEquals(expected, result);
	}

	@Test
	public void AscendingOrderTest() {
		treeSet.add(car1);
		treeSet.add(car2);
		treeSet.add(car3);
		treeSet.add(car4);
		Iterator<Car> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			result += iterator.next().toString();
		}
		String expected = "Car [make=AUDI, model=J5, year=200, price=8076.0]"
				+ "Car [make=BMW, model=J3, year=2000, price=9.99999996E8]"
				+ "Car [make=MERCEDES, model=J4, year=2000, price=9999996.0]";
		assertEquals(expected, result);
	}

}
