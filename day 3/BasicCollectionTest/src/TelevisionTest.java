import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;


public class TelevisionTest {
	private Television television1;
	private Television television2;
	private Television television3;
	private Television television4;
	Set<Television>set=new HashSet<Television>();
	@Test
	public void test() {
		television1=new Television("ABC", "LCD", false, 1000);
		television2=new Television("XYZ", "LED", true, 10000);
		television3=new Television("UVW", "LED", true,9800);
		television4=new Television("XYZ", "LED", false,10000);
		set.add(television1);
		set.add(television2);
		set.add(television3);
		set.add(television4);
		Iterator <Television>iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().toString());
		}
	}

}
