import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class LaptopTest {
	private Laptop laptop1;
	private Laptop laptop2;
	private Laptop laptop3;
	Set<Laptop> set = new HashSet<Laptop>();
	private Laptop laptop4;
	private String result="";

	@Test
	public void DuplicateTest() {
		laptop1 = new Laptop("HP", "5S", "WINDOWS", "I7");
		laptop2 = new Laptop("DELL", "6S", "WINDOWS", "I7");
		laptop3 = new Laptop("MAC", "PRO", "MAC OS", "I8");
		laptop4 = new Laptop("HP", "5S", "DOWS", "I5");
		set.add(laptop1);
		set.add(laptop2);
		set.add(laptop3);
		set.add(laptop4);
		Iterator<Laptop> iterator = set.iterator();
		while (iterator.hasNext()) {
			result+=iterator.next().toString();
		}
		String expected = "Laptop [company=DELL, model=6S, operatingSystem=WINDOWS, processor=I7]"
				+ "Laptop [company=HP, model=5S, operatingSystem=WINDOWS, processor=I7]"
				+ "Laptop [company=MAC, model=PRO, operatingSystem=MAC OS, processor=I8]";
		
		assertEquals(expected,result);
	}
}
